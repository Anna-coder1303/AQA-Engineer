import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;


public class JsonObject {
    @Test
    public void testGetRequest() {
        RestAssured.baseURI = "https://postman-echo.com";
        Response response = given()
                .when()
                .get("/get");
        response.then()
                .assertThat()
                .statusCode(200)
                .body("url", equalTo("https://postman-echo.com/get"));
    }

    @Test
    public void testPostRequest() {
        RestAssured.baseURI = "https://postman-echo.com";
        String requestBody = "data: key";
        Response response = given()
                .header("Content-Type", "application/json")
                .body(requestBody)
                .when()
                .post("/post");
        response.then()
                .assertThat()
                .statusCode(200);
        response.then()
                .assertThat()
                .body("data", containsString("key"));
    }

    @Test
    public void testPutRequest() {
        RestAssured.baseURI = "https://postman-echo.com";
        String requestBody = "data: key";
        Response response = given()
                .header("Content-Type", "application/json")
                .body(requestBody)
                .when()
                .put("/put");
        response.then()
                .assertThat()
                .statusCode(200);
        response.then()
                .assertThat()
                .body("data", containsString("key"));

    }

    @Test
    public void testPatchRequest() {
        RestAssured.baseURI = "https://postman-echo.com";
        String patchRequestBody = "data: key";
        Response response = given()
                .header("Content-Type", "application/json")
                .body(patchRequestBody)
                .when()
                .patch("/patch");
        response.then()
                .assertThat()
                .statusCode(200);
        response.then()
                .assertThat()
                .body("data", containsString("key"));
    }

    @Test
    public void testDeleteRequest() {
        RestAssured.baseURI = "https://postman-echo.com";
        String deleteRequestBody = "data: key";
        Response response = given()
                .header("Content-Type", "application/json")
                .body(deleteRequestBody)
                .when()
                .delete("/delete");
        response.then()
                .assertThat()
                .statusCode(200);
        response.then()
                .assertThat()
                .body("data", containsString("key"));
    }
}