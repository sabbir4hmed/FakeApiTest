package Tests;

import Service.GetProduct;
import io.restassured.response.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class GetProductTest
{
    private static final Logger log = LoggerFactory.getLogger(GetProductTest.class);
    GetProduct getProduct = new GetProduct();

        
        @Test(testName = "Get all products")
        public void testgetallproduct()
        {
            Response response = getProduct.getallproducts();
            Assert.assertEquals(response.getStatusCode(), 200);
            System.out.println("Getting Status Code is: " + response.getStatusCode());
            //response.prettyPrint();
            log.info("Get all products");


        }


        @Test(testName = "Get Single product")
        public void testgetsingleproduct()
        {
            List<Response> responses = getProduct.getproductbysingleid();

            for(int i = 0; i< responses.size(); i++)
            {
                Response response = responses.get(i);
                Assert.assertEquals(response.getStatusCode(),200);
                log.info("Product ID: " + (i+1));

                System.out.println("Getting Status Code is: " + response.getStatusCode());
                //response.prettyPrint();
            }
        }



}
