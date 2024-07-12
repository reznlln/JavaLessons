package lessons;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import netscape.javascript.JSObject;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static io.restassured.http.ContentType.JSON;
import static org.hamcrest.Matchers.equalTo;

public class ParsingResponseBody {

    private JSONObject jo;

    @Before
    public void setUp(){
        RestAssured.baseURI = "https://reqres.in/";
    }

    @Test
    public void getBodyUsers(){
        Response res = given().contentType(ContentType.JSON)
                .when().get("api/users");

        Assert.assertEquals(res.getStatusCode(),200);
        res.then().statusCode(200);

        //first validation approach (using then())
        res.then().body("data.id[1]",equalTo(2)).log().all();

        //JSON path approach
        String EmailUser = res.jsonPath().get("data[2].email").toString();
        Assert.assertEquals("Значения не равны",EmailUser, "emma.wong@reqres.in");

        //System.out.println("Response body: " + res.jsonPath().get("data").toString());
    }

    @Test
    public void checkEmailUsers(){
        Response res = given().contentType(ContentType.JSON)
                .when().get("api/users");

        //JSON Object Class
        JSONObject jo = new JSONObject(res.asString());//converting response to json type
        System.out.println(jo.getJSONArray("data"));

        //print all user emails
        for (int i = 0; i < jo.getJSONArray("data").length(); i++){

            String UserEmail = jo.getJSONArray("data").getJSONObject(i).get("email").toString();
            System.out.println(UserEmail);
        }
    }
}
