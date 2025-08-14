package Service;

import Base.BaseService;
import io.restassured.response.Response;

import java.util.ArrayList;
import java.util.List;

public class GetProduct extends BaseService {

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


}
