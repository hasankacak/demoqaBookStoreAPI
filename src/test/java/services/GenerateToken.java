package services;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import utilities.ConfigurationReader;

import java.util.HashMap;
import java.util.Map;

public class GenerateToken {
    Response response;
    public String token;
    public void generateToken(){
        /*
        "userName": "string",
        "password": "string"
         */

        String password = ConfigurationReader.get("commonPassword");
        String username = ConfigurationReader.get("username");

        Map<String, Object> body=new HashMap<>();
        body.put("userName", username);
        body.put("password", password);

        response= RestAssured.given().contentType(ContentType.JSON)
                .body(body)
                .when().log().all()
                .post("/Account/v1/GenerateToken").prettyPeek();
        token=response.path("token");
        System.out.println("token = " + token);
        //token = eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyTmFtZSI6Ik1pc3MgQ2FsZWIgS2VlbGluZyIsInBhc3N3b3JkIjoiVGVzdDEyMzQ1NiEiLCJpYXQiOjE2NzUxODc2MDN9.BZTcrqP79PINp3LpXKmT0eCoeQsPUIlSzep-ZmRxzJM
    }

    public void verifyGenerateStatusCode(){
        response.then().statusCode(200);
    }


}
