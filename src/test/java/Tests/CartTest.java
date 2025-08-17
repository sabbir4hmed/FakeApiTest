package Tests;

import Service.Carts;
import io.restassured.response.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class CartTest {

    Carts cartTest = new Carts();

    private static final Logger log = LoggerFactory.getLogger(CartTest.class);

    @Test(testName = "Get all Carts", priority = 5)
    public void getallcartlist()
    {
        Response response = cartTest.getallcart();
        Assert.assertEquals(response.getStatusCode(),200);
        log.info("Get all Carts");
        System.out.println("The status code is" + response.statusCode());
    }

    @Test(testName = "Get single status code", priority = 4)
    public void getsingleproductcart()
    {
        List<Response> responses = cartTest.getsinglecart();

        for (int i = 1; i < responses.size(); i++)
        {
            Response response = responses.get(i);
            Assert.assertEquals(response.getStatusCode(),200);
            log.info("Get Single Cart");
            System.out.println("The status code is: "+ response.statusCode());
        }


    }

    @Test(testName = "Add product in Cart", priority = 1)
    public void createsingleproduct()
    {
        Response response = cartTest.createcart();
        Assert.assertEquals(response.getStatusCode(), 201);
        log.info("Ädd product in cart");
        System.out.println("The status code is: " + response.statusCode());
        response.prettyPrint();
    }


    @Test(testName = "Updae the product cart", priority = 2)
    public void updateproductcart()
    {
        Response response = cartTest.updatecart();
        Assert.assertEquals(response.getStatusCode(), 200);
        log.info("Upadte the product cart");
        System.out.println("The status code is: " + response.statusCode());
        response.prettyPrint();
    }

    @Test(testName = "Delete the cart", priority = 3)
    public void deletecart()
    {
        Response response = cartTest.deletecart();
        Assert.assertEquals(response.getStatusCode(), 200);
        System.out.println("The status code is: "+ response.statusCode());
        log.info("Delete the cart");
        response.prettyPrint();
    }


}
