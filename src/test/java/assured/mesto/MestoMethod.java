package assured.mesto;

import io.restassured.RestAssured;
import static org.hamcrest.Matchers.equalTo;
import org.junit.Before;
import org.junit.Test;
import java.util.Random;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class MestoMethod {

    @Before
    public void SetUp() {
        RestAssured.baseURI = "https://qa-mesto.praktikum-services.ru";
      //  final String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NjY4MGM3Y2QxNzRhNDAwM2QwYWE0YTEiLCJpYXQiOjE3MTkzMjc3MzgsImV4cCI6MTcxOTkzMjUzOH0.kSJtnF7Z0hRy500AcE8Y5olhpg9iunUsFgBuSNLvBAU";
    }

    @Test
    public void checkMethodCreatePost(){
        final String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NjY4MGM3Y2QxNzRhNDAwM2QwYWE0YTEiLCJpYXQiOjE3MTkzMjc3MzgsImV4cCI6MTcxOTkzMjUzOH0.kSJtnF7Z0hRy500AcE8Y5olhpg9iunUsFgBuSNLvBAU";
        String link = "https://cdn.pixabay.com/photo/2016/06/11/13/04/night-1450087_1280.jpg";
        Random random = new Random();
        int name = random.nextInt(500);
        HashMap data = new HashMap();
        data.put("link",link);
        data.put("name","Name" + name);
        given()
                .auth().oauth2(token)
                .contentType("application/json")
                .body(data)
                .when().post("/api/cards")
                .then().statusCode(201)
                .body("data.link", equalTo(link))
                .body("data.name", equalTo("Name" + name))
                .log().all();
    }
}
