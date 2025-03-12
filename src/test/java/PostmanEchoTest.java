import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.junit.jupiter.api.Test;

public class PostmanEchoTest {

    @Test
    public void testPostRequest() {
        // Отправляем данные "some data".
        given()
                .baseUri("https://postman-echo.com")
                .body("some data")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                // Проверяем, что в поле "data" содержится отправленный текст
                .body("data", equalTo("some data"));
    }
}