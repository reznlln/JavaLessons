package lessons;
import io.restassured.response.Response;
import org.testng.annotations.*;
import io.restassured.*;
import io.restassured.RestAssured;
import org.junit.Before;
import org.junit.Test;
import org.testng.TestRunner;
import org.testng.TestNG;

import java.util.HashMap;
import java.util.PriorityQueue;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;


public class HTTPRequest {

    int id = 8;

    @Before
    public void setUp(){
        RestAssured.baseURI = "https://reqres.in";

    }

    @Test //(Priority = 1)
    public void getUsers(){
        //given()
                 when().get("/api/users?page=2")
                .then()
                .body("data.id[0]", equalTo(7))
                .statusCode(200)
                .log().all();
    }

    @Test()
    public void createUser(){
        HashMap data = new HashMap();
        data.put("name","Fedor Test");
        data.put("job", "volleyball player");

        given().body(data)
                .when().post("/api/users")//.jsonPath().getInt("id");
                .then().statusCode(201).log().all();

    }

    @Test
    public void updateUser(){
        HashMap data = new HashMap();
        data.put("name","Fedor");
        data.put("job", "football player");
        Response response = given().body(data)
                .when().put("/api/users/" + id);
        response.then().statusCode(200).log().all();
        System.out.println(response.asString());
    }

    @Test
    public void deleteUser(){
        Response response = when().delete("/api/users/" + id);
        response.then().statusCode(204).log().all();
    }

    @Test
    public void getUsersQuery(){
        // /api/users?page=2
        given()
                //.queryParam("page","2")
                //https://reqres.in/api/users?id=7
                .queryParam("id","7")
                .when().get("/api/users")
                .then().statusCode(200)
                .log().all();
    }
}
