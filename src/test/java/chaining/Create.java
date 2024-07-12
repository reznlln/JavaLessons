package chaining;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class Create {
    @Test
    public void CreateNewPet() throws JsonProcessingException {
        /*Category category = new Category("4","home pet");
        String[] photoUrls = {"www.photo.com","www.photo2.com"};
        //Tags[] tags = {"1","white"};
        ArrayList<Tags> tags = new ArrayList<Tags>();
        tags.add(new Tags("1","white"));
        Pet pet = new Pet("47338400",category,"kisa",photoUrls,"available",tags);*/
        ArrayList<Tags> tags = new ArrayList<Tags>();
        tags.add(new Tags("1","white"));
        Pet pet = new Pet();
        pet.setName("Piter");
        pet.setStatus("available");
        pet.setId(500);
        //pet.setTags(tags);


        ObjectMapper obj = new ObjectMapper();
        String data = obj.writerWithDefaultPrettyPrinter().writeValueAsString(pet);
        /*given()
                .body(data)
                .when().post("https://petstore.swagger.io/v2/pet")
                        .then().statusCode(200)
                        .log().all();*/
        System.out.println(data);
        System.out.println(tags);

    }
}
