package usersMe;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Before;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.request;
import static org.hamcrest.Matchers.equalTo;

/*
given()
.when()
    get, put, post, delete
.then()
    extract response, validate statusCode
 */

public class CheckUsers {

    @Before
    public void setUp(){
        RestAssured.baseURI = "https://qa-mesto.praktikum-services.ru";
    }

    @Test
    public  void UpdateProfile(){
        Users users = new Users("Karl","Travel");
        String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NjY4MGM3Y2QxNzRhNDAwM2QwYWE0YTEiLCJpYXQiOjE3MTgwOTQ5NzIsImV4cCI6MTcxODY5OTc3Mn0.XCCFvSWqM2_uDfW-ZmQKDYsrDFvYBsAN5Ac8VO6xWgI";
        Response response =
                given().auth().oauth2(token)
                        .header("Content-type", "application/json").and()
                        .body(users).when().patch("api/users/me");
        response.then().statusCode(200).and().assertThat().body("data.name", equalTo(users.getName()));
        System.out.println(response.body().asString());
    }
}
