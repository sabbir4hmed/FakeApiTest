package Tests;

import Service.Carts;
import io.restassured.response.Response;

public class CartTest {

    Carts cartTest = new Carts();


    public void getallcartlist()
    {
        Response response = cartTest.getallcart();
    }



}
