package RestAssuredAPITest;

import TestNGListeners.Log;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class getPet {

    private static final String baseurl = "https://petstore.swagger.io/v2";

    @Test
    public void getPetDetails()
    {
        int petId = 10;
        Log.info("I am running get Pet Details API");
        Response response = RestAssured.given()
                .baseUri(baseurl)
                .basePath("/pet/{petId}")
                .pathParam("petId", petId)
                .when()
                .get();

        // google.com/adbc?var=44&dsn=12
        response.prettyPrint();

        Assert.assertEquals(response.statusCode(),200);

        Assert.assertEquals(response.jsonPath().getInt("id"),petId);
        Assert.assertEquals(response.jsonPath().getString("name"),"doggie");

    }


    @Test
    public void getPetDetailsNotFound()
    {
        Log.info("I am running get Pet Details API - Not Found");

        int petId = 10000000;

        Response response = RestAssured.given()
                .baseUri(baseurl)
                .basePath("/pet/{petId}")
                .pathParam("petId", petId)
                .when()
                .get();

        // google.com/adbc?var=44&dsn=12
        response.prettyPrint();

        Assert.assertEquals(response.statusCode(),404);

        Assert.assertEquals(response.jsonPath().getString("message"),"Pet not found");

    }

    @Test
    public void getPetDetailsUrlMismatch()
    {
        Log.info("I am running get Pet Details API - Mis match");

        int petId = 10000000;

        Response response = RestAssured.given()
                .baseUri(baseurl)
                .basePath("/et/{petId}")
                .pathParam("petId", petId)
                .when()
                .get();

        //then().contentType(ContentType.XML)
        //      .extract().path("message");

        // google.com/adbc?var=44&dsn=12
        response.prettyPrint();

        Assert.assertEquals(response.statusCode(),404);

       // Assert.assertEquals(response.jsonPath().getString("message"),"Pet not found");

    }

    @Test
    void createPetInPetSwagger()
    {
        Log.info("I am running for creating a new Pet");

            String petJson = "{\n" +
                    "  \"id\": 1981,\n" +
                    "  \"category\": {\n" +
                    "    \"id\": 0,\n" +
                    "    \"name\": \"string\"\n" +
                    "  },\n" +
                    "  \"name\": \"doggie\",\n" +
                    "  \"photoUrls\": [\n" +
                    "    \"string\"\n" +
                    "  ],\n" +
                    "  \"tags\": [\n" +
                    "    {\n" +
                    "      \"id\": 0,\n" +
                    "      \"name\": \"string\"\n" +
                    "    }\n" +
                    "  ],\n" +
                    "  \"status\": \"available\"\n" +
                    "}";

            Response response = RestAssured.given()
                    .baseUri(baseurl)
                    .basePath("/pet")
                    .contentType(ContentType.JSON)
                    .body(petJson)
                    .when()
                            .post();

            response.prettyPrint();

            Assert.assertEquals(response.statusCode(), 200);

            Assert.assertEquals(response.jsonPath().getString("status"), "available");
    }
}
