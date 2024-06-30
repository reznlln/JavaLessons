package assured;

import io.restassured.RestAssured;
import org.junit.Before;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GoogleGet {
 //https://www.google.ru/search?q=слово
    @Before
    public void setUp(){
        RestAssured.baseURI = "https://www.google.ru/";
    }

    @Test
    public void getSearch(){
        given()
                .queryParam("q","слово")
                .when().get("search")
                .then().statusCode(200)
                .log().all();
    }
}
