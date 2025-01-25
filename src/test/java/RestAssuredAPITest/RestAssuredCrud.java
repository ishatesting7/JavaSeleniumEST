package RestAssuredAPITest;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Random;

public class RestAssuredCrud extends BaseClass{

    String id;
    int petid;
        @BeforeTest
        void getPetId() {
            Random random = new Random();
             id= String.format("%04d", random.nextInt(10000));
             petid= Integer.parseInt(id);
             System.out.println(id);
        }
        @Test
        public void createPet()
        {
            String reqestBody = "{\n" +
                    "  \"id\": " + petid +",\n" +
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
            Response response = createRequest("/pet", reqestBody);
            Assert.assertEquals(response.getStatusCode(), 200);

        }
        @Test
        public void readPet()
        {
            Response response = getRequest("/pet/"+petid);
            Assert.assertEquals(response.getStatusCode(), 200);
        }

}
