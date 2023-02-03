package services;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import utilities.ConfigurationReader;

import java.util.HashMap;
import java.util.Map;
public class AllBooks {

    Response response;
    public void bookList(){

        Map<String, Object>token=new HashMap<>();
        token.put("Authorization", "Bearer " + ConfigurationReader.get("token"));

        response=RestAssured.given().contentType(ContentType.JSON)
                .headers(token)
                .when().log().all()
                .get("/BookStore/v1/Books").prettyPeek();

    }

    public void verifyBookList(){
        response.then().statusCode(200);
    }

}
