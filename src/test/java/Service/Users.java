package Service;

import Base.BaseService;
import io.restassured.response.Response;

import java.util.ArrayList;
import java.util.List;

public class Users extends BaseService {

    public Response getallusers()
    {
        return request
                .get("/users");
    }

    public List<Response> getsingleuser()
    {
        List<Response> responses = new ArrayList<>();

        for(int i =1; i<= 10; i++)
        {
            Response response = request.get("/users/" + i);
            responses.add(response);
        }
        return responses;
    }




}
