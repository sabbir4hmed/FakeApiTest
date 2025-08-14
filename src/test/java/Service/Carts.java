package Service;

import Base.BaseService;
import io.restassured.response.Response;

public class Carts extends BaseService {

    public Response getallcart()
    {
        return request
                .get("/carts");
    }



}
