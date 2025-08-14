package Tests;

import Service.Product;
import io.restassured.response.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ProductTest
{
    private static final Logger log = LoggerFactory.getLogger(ProductTest.class);
    Product product = new Product();


        @Test(testName = "Get all products" , priority = 5)
        public void testgetallproduct()
        {
            Response response = product.getallproducts();
            Assert.assertEquals(response.getStatusCode(), 200);
            System.out.println("Getting Status Code is: " + response.getStatusCode());
            //response.prettyPrint();
            log.info("Get all products");


        }


        @Test(testName = "Get Single product" , priority = 4)
        public void testgetsingleproduct()
        {
            List<Response> responses = product.getproductbysingleid();

            for(int i = 0; i< responses.size(); i++)
            {
                Response response = responses.get(i);
                Assert.assertEquals(response.getStatusCode(),200);
                log.info("Product ID: " + (i+1));

                System.out.println("Getting Status Code is: " + response.getStatusCode());
                //response.prettyPrint();
            }
        }

        @Test(testName = "Add New Product", priority = 1)
        public void testaddproduct()
        {
            Response response = product.createproduct();
            Assert.assertEquals(response.getStatusCode(), 201);
            log.info("Add Product");
            System.out.println("Getting Status Code is: " + response.getStatusCode());
            response.prettyPrint();
        }

        @Test(testName = "Update the Product" , priority = 2)
        public void testupdateproduct()
        {
            Response response = product.updateproduct();
            Assert.assertEquals(response.getStatusCode(),200);
            log.info("Update Product");
            System.out.println("Getting Status Code is: " + response.getStatusCode());
            response.prettyPrint();
        }

        @Test(testName = "Delete the product", priority = 3)

        public void testdeleteproduct()
        {
            Response response = product.deleteproduct();
            Assert.assertEquals(response.getStatusCode(), 200);
            log.info("Delete the product");
            System.out.println("Getting Status Code is: " + response.getStatusCode());
            System.out.println("Getting Status Code is: " + product.getallproducts());
        }

}
