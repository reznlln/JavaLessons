package lessons;

import io.restassured.response.Response;
import org.junit.Test;

import java.util.Map;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class CheckCookies {

    @Test
    public void testCookies(){
        when()
                .get("https://www.google.com/")
                .then().statusCode(200)
                .log().all();
    }

    @Test
    public void getCookie(){
        Response res =
                when().get("https://www.google.com/");

        //get single cookies info
        String cookie_value = res.getCookie("AEC");
        System.out.println("Value of cookie is ==> " + cookie_value);
    }

    @Test
    public void getMultipleCookies(){
        Response res =
                when().get("https://www.google.com/");
        //get all cookies info names and values
         Map<String,String> cookies_value = res.getCookies();
        System.out.println("Ключ и значение всех куков: " + cookies_value);
        //get single cookie info
        String cookies_value2 = res.getCookie("AEC");
        System.out.println("Значение AEC: " + cookies_value2);

        //Print only Cookies name
        System.out.println("Список всех куков: " + cookies_value.keySet());

        // cookies_value.keySet() =  [AEC, NID]
        for(String x: cookies_value.keySet()){
            System.out.println( "Имя кука: " + x + " Значение кука: " + res.getCookie(x));
        }
    }
}
