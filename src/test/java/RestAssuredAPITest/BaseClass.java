package RestAssuredAPITest;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;

public class BaseClass {

    @BeforeClass
    public void setup()
    {
        RestAssured.baseURI = "https://petstore.swagger.io/v2";
    }
    protected Response createRequest(String endpoint, String body)
    {
        return RestAssured
                .given()
                .header("Content-Type","application/json")
                .body(body)
                .post(endpoint);
    }

    protected Response getRequest(String endpoint)
    {
        return RestAssured
                .given()
                .get(endpoint);
    }

    protected Response putRequest(String endpoint, String body)
    {
        return RestAssured
                .given()
                .header("Content-Type", "application/json")
                .body(body)
                .put(endpoint);

    }

    protected Response deleteRequest(String endpoint)
    {
        return RestAssured
                .given()
                .delete(endpoint);
    }
}
