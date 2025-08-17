package Service;

import Base.BaseService;
import io.restassured.response.Response;

public class Users extends BaseService {

    public Response getallusers()
    {
        return request
                .get("/users");
    }



}
