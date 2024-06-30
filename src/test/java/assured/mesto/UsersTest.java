package assured.mesto;
// импортируем RestAssured
import io.restassured.RestAssured;
// импортируем Before
import io.restassured.response.Response;
import org.junit.Before;
// импортируем Test
import org.junit.Test;
// дополнительный статический импорт нужен, чтобы использовать given(), get() и then()
import java.io.File;

import static io.restassured.RestAssured.*;
import static org.hamcrest.CoreMatchers.notNullValue;

public class UsersTest {

    // аннотация Before показывает, что метод будет выполняться перед каждым тестовым методом
    @Before
    public void setUp() {
        // повторяющуюся для разных ручек часть URL лучше записать в переменную в методе Before
        // если в классе будет несколько тестов, указывать её придётся только один раз
        RestAssured.baseURI = "https://qa-mesto.praktikum-services.ru";
    }

    // создаём метод автотеста
    @Test
    public void getMyInfoStatusCode() {
        // метод given() помогает сформировать запрос
        given()
                // указываем протокол и данные авторизации
                .auth().oauth2("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NjY4MGM3Y2QxNzRhNDAwM2QwYWE0YTEiLCJpYXQiOjE3MTgwOTQ5NzIsImV4cCI6MTcxODY5OTc3Mn0.XCCFvSWqM2_uDfW-ZmQKDYsrDFvYBsAN5Ac8VO6xWgI")
                // отправляем GET-запрос с помощью метода get, недостающую часть URL (ручку) передаём в него в качестве параметра
                .get("/api/users/me")
                // проверяем, что статус-код ответа равен 200
                .then().statusCode(200);
    }

    @Test
    public void PostUserCard(){
        String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NjY4MGM3Y2QxNzRhNDAwM2QwYWE0YTEiLCJpYXQiOjE3MTgwOTQ5NzIsImV4cCI6MTcxODY5OTc3Mn0.XCCFvSWqM2_uDfW-ZmQKDYsrDFvYBsAN5Ac8VO6xWgI";
        File file = new File("src/test/resources/newCard.json");
        Response response = given().header("Content-type", "application/json").auth().oauth2(token).and().body(file).when()
                .post("/api/cards");
        response.then().statusCode(201).and().assertThat().body("data._id", notNullValue());
        System.out.println(response.body().asString());
    }

}