package usersMePojoClass;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Before;
import org.junit.Test;

//for working Object Mapper
//import com.fasterxml.jackson.databind.ObjectMapper;

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

    // Pojo ----> Serialize ----> JSON Object

    @Test
    public  void UpdateProfile() throws JsonProcessingException {

        // created java object using pojo class
        Users users = new Users();
        users.setName("Karl");
        users.setAbout("Blogger");
        String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NjY4MGM3Y2QxNzRhNDAwM2QwYWE0YTEiLCJpYXQiOjE3MjA0MzQwNzUsImV4cCI6MTcyMTAzODg3NX0.fgE_eh0j-2TC1w4WihQru890aida-0c4rMoKysC3Yw0";

        // convert java object into json object (serialization)
        ObjectMapper objMapper = new ObjectMapper();
        String jsonData = objMapper.writerWithDefaultPrettyPrinter().writeValueAsString(users);

        Response response =
                given().auth().oauth2(token)
                        .header("Content-type", "application/json").and()
                        .body(jsonData)
                        .when().patch("api/users/me");
        response.then().statusCode(200).and().assertThat().body("data.name", equalTo(users.getName()));
        System.out.println("result body is: " + response.body().asString());

        //String responseBody = objMapper.writerWithDefaultPrettyPrinter().writeValueAsString(response);
        System.out.println("jsonData: " + jsonData);
    }

    // deserialization
    @Test
    public void ConvertJson2Pojo() throws JsonProcessingException {
        String json = "{\"name\":\"Karl\",\"about\":\"Travel\"}";

        // convert json data to pojo object
        ObjectMapper obj = new ObjectMapper();
        Users dataUser = obj.readValue(json, Users.class); //convert json to pojo class

        System.out.println(dataUser.getName());
        System.out.println(dataUser.getAbout());
    }
}
