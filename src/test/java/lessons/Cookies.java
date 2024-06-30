package lessons;

import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class Cookies {

    @Test
    public void testCookies(){
        when()
                .get("https://www.google.com/")
                .then().statusCode(200)
                .log().all();
    }

    @Test
    public void getCookies(){
        Response res =
                when().get("https://www.google.com/");

        //get single cookies info
        String cookie_value = res.getCookie("AEC");
        System.out.println("Value of cookie is ==> " + cookie_value);
    }
}
