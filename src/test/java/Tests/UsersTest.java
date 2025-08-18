package Tests;

import Service.Users;
import io.restassured.response.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

public class UsersTest {

    Users users = new Users();

    private static final Logger log = LoggerFactory.getLogger(UsersTest.class);

    @Test(testName = "Get all users", priority = 1)
    public void getalluser()
    {
        Response response = users.getallusers();
        Assert.assertEquals(response.getStatusCode(), 200);
        log.info("Get all users");
        System.out.println("The status code is: " + response.statusCode());
    }

    @Test(testName = "Get all single user", priority = 2)
    public void getsingleuser()
    {
        List<Response> responses = new ArrayList<>();

        for(int i = 1; i< responses.size(); i++)
        {
            Response response = responses.get(i);
            Assert.assertEquals(response.getStatusCode(), 200);
            log.info("Get single user");
            System.out.println("The status code is: " + response.statusCode());

        }
    }



}
