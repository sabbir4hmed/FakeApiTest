package Service;

import Base.BaseService;
import io.restassured.response.Response;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Carts extends BaseService {

    public Response getallcart()
    {
        return request
                .get("/carts");
    }

    public List<Response> getsinglecart()
    {
        int i , totalid = 7;

        List<Response> responses = new ArrayList<>();

        for (i = 1; i<= totalid; i++)
        {
            Response response = request.get("/carts/"+i);
            responses.add(response);

        }
        return responses;

    }

    public Response createcart()
    {
        Map<String,Object> data = new HashMap<>();

        data.put("id", 8);
        data.put("userId", 8);
        data.put("date", "2025-08-16T00:00:00.000Z");

        Map<String, Object> product = new HashMap<>();

        product.put("productId", 19);
        product.put("quantity", 10);

        data.put("products", product);

        return request
                .body(data)
                .post("/carts/");

    }

    public Response updatecart()
    {
        Map<String,Object> data = new HashMap<>();

        data.put("id", 2);
        data.put("userId", 1);
        data.put("date", "2021-01-02T00:00:00.000");

        Map<String,Object> product = new HashMap<>();

        product.put("productId", 3);
        product.put("quantity", 5);

        data.put("products", product);

        return request
                .body(data)
                .put("/carts/"+ 2);
    }


    public Response deletecart()
    {
        return request
                .delete("/carts/"+ 6);
    }

}
