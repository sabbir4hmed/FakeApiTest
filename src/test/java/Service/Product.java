package Service;

import Base.BaseService;
import io.restassured.response.Response;

import java.util.*;

public class Product extends BaseService {

    public Response getallproducts()
    {
        return request.get("/products");
    }

    public List<Response> getproductbysingleid()
    {
        int i, totalid = 20;

        List<Response> responses = new ArrayList<>();

        for(i = 1; i<= totalid; i++)
        {
          Response response =  request.get("/products/" + i);
          responses.add(response);

        }

        return responses;
    }


    // Add a new Product


    public Response createproduct()
    {

        Map<String, Object> data = new HashMap<>();

        data.put("id", 21);
        data.put("title", "Denim Pant");
        data.put("price", 60.25);
        data.put("description", "This is the denim pant");
        data.put("category", "men's clothing");
        data.put("image", "https://images.othoba.com/images/thumbs/0547350_mens-slim-fit-stretchable-denim-jeans-pant-deep-blue.webp");

        Map<String, Object> prodcutrating = new HashMap<>();

        prodcutrating.put("rate", 4.3);
        prodcutrating.put("count", 300);

        data.put("rating", prodcutrating);


        return request
                .body(data)
                .post("/products/");
    }


    public Response updateproduct()
    {

        Map<String,Object> updateproductdata = new HashMap<>();

        updateproductdata.put("price", 62.75);
        updateproductdata.put("title", "Denim Pant - Price Updated");

        return request
                .body(updateproductdata)
                .patch("/products/" + 21);

    }

    public Response deleteproduct()
    {
        return request
                .delete("/products/"+ 15);
    }





}
