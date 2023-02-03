package services;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import utilities.ConfigurationReader;

import java.util.HashMap;
import java.util.Map;

public class AddBooks {

    Response response;
    public void addBooks(){
    String body="{\n" +
            "  \"userId\": \""+ ConfigurationReader.get("userID") +"\",\n" +
            "  \"collectionOfIsbns\": [\n" +
            "    {\n" +
            "      \"isbn\": \""+ConfigurationReader.get("isbn3")+"\"\n" +
            "    }\n" +
            "  ]\n" +
            "}";
        Map<String, Object> token=new HashMap<>();
        token.put("Authorization", "Bearer " + ConfigurationReader.get("token"));

    response= RestAssured.given().contentType(ContentType.JSON)
            .headers(token)
            .body(body)
            .when().log().all()
            .post("/BookStore/v1/Books").prettyPeek();
    }

    public void verifyAddBooks(){
        response.then().statusCode(201);
    }
}
