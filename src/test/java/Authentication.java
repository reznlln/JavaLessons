import io.restassured.RestAssured;
import org.junit.Before;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Authentication {

       @Test
    public void BasicAuthentication(){
        given().auth().basic("postman","password")
                .when().get("https://postman-echo.com/basic-auth")
                .then().statusCode(200)
                .body("authenticated",equalTo(true))
                .log().all();
    }

    @Test
    public void DigestAuthentication(){
        given().auth().digest("postman","password")
                .when().get("https://postman-echo.com/basic-auth")
                .then().statusCode(200)
                .body("authenticated",equalTo(true))
                .log().all();
    }

    @Test
    public void BearerTokenAuthentication(){

        String bearerToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NjY4MGM3Y2QxNzRhNDAwM2QwYWE0YTEiLCJpYXQiOjE3MjA2NDUwNzAsImV4cCI6MTcyMTI0OTg3MH0.Qlk8mN9cR3HXJKokRoWantAH9JBniA0uIxI0ZRZPfuo";
        given()
                .headers("Authorization","Bearer " + bearerToken)
                .when().get("https://qa-mesto.praktikum-services.ru/api/users/me")
                .then().log().all();
    }

    @Test
    public void OAuth2Authentication(){
           String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NjY4MGM3Y2QxNzRhNDAwM2QwYWE0YTEiLCJpYXQiOjE3MjA2NDUwNzAsImV4cCI6MTcyMTI0OTg3MH0.Qlk8mN9cR3HXJKokRoWantAH9JBniA0uIxI0ZRZPfuo";
           given().auth().oauth2(token)
                   .when().get("https://qa-mesto.praktikum-services.ru/api/users/me")
                   .then().statusCode(200)
                   .log().all();
    }

    //Test failed
    @Test
    public void APIKeyAuthentication() {
        given()
                .queryParam("appid", "792618aef4f71fd5f4de378bb8e38f45")
                .queryParam("q","Russia")
                .pathParam("mypath","data/2.5/forecast/daily")
                .when().get("https://api.openweathermap.org/{mypath}")
                .then().statusCode(401)
                .log().all();
    }
}
