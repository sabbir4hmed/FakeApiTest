package Tests;

import Service.Users;
import io.restassured.response.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.security.PublicKey;

public class UsersTest {

    Users users = new Users();

    private static final Logger log = LoggerFactory.getLogger(UsersTest.class);

    @Test
    public void getalluser()
    {
        Response response = users.getallusers();
        Assert.assertEquals(response.getStatusCode(), 200);
        log.info("Get all users");
        System.out.println("The status code is: " + response.statusCode());
    }



}
