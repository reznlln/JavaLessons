package assured.mesto;
import static org.hamcrest.Matchers.equalTo;

import io.restassured.response.Response;
import org.junit.Before;
import io.restassured.RestAssured;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class CheckUserName {

    @Before
    public void SetUp(){
        RestAssured.baseURI = "https://qa-mesto.praktikum-services.ru";
        }

    @Test
    public void CheckUserName(){
        String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NjY4MGM3Y2QxNzRhNDAwM2QwYWE0YTEiLCJpYXQiOjE3MTgwOTQ5NzIsImV4cCI6MTcxODY5OTc3Mn0.XCCFvSWqM2_uDfW-ZmQKDYsrDFvYBsAN5Ac8VO6xWgI";
        given()
                .auth().oauth2(token)
                .get("/api/users/me")
                .then().assertThat().body("data.name",equalTo("Жак-Ив Кусто"));
    }

    @Test
    public void CheckUserNameAndPrintResponse(){
        String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NjY4MGM3Y2QxNzRhNDAwM2QwYWE0YTEiLCJpYXQiOjE3MTgwOTQ5NzIsImV4cCI6MTcxODY5OTc3Mn0.XCCFvSWqM2_uDfW-ZmQKDYsrDFvYBsAN5Ac8VO6xWgI";
        Response response = given()
                .auth().oauth2(token)
                .get("/api/users/me");
        response.then().assertThat().body("data.name", equalTo("Жак-Ив Кусто"));
        System.out.println(response.body().asString());
    }
}
