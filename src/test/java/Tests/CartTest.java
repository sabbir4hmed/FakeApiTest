package Tests;

import Service.Carts;
import io.restassured.response.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartTest {

    Carts cartTest = new Carts();

    private static final Logger log = LoggerFactory.getLogger(CartTest.class);

    @Test(testName = "Get all Carts", priority = 1)
    public void getallcartlist()
    {
        Response response = cartTest.getallcart();
        Assert.assertEquals(response.getStatusCode(),200);
        log.info("Get all Carts");
        System.out.println("The status code is" + response.statusCode());
    }



}
