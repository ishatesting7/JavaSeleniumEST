package testCases;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import pojoClass.User;

import static io.restassured.RestAssured.given;

public class PostUserRequestWithPojo {

    @Test
    void createUser()
    {
        RestAssured.baseURI = "https://petstore.swagger.io/v2";

        User user = new User(100, "ABC", "XYZ", "PQR", "abc@gmail.com", "123","1234123455", 29);
        user.setId(100);
        user.setUsername("ABC");
        user.setFirstName("XYZ");
        user.setLastName("PQR");
        user.setEmail("abc@gmail.com");
        user.setPassword("123");
        user.setPhoneNumber("1234123455");
        user.setUserStatus(29);

        Response response = given()
                .header("Content-Type", "application/json")
                .body(user)
                .post("/user");

        System.out.println("Status Code - "+ response.getStatusCode());

        System.out.println("Response Body - "+ response.getBody().asString());

    }
}
