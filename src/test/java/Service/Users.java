package Service;

import Base.BaseService;
import io.restassured.response.Response;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    public Response adduser()
    {
        Map<String, Object> data = new HashMap<>();

        data.put("id", 11);
        data.put("email", "sabbir4hmed@gmail.com");
        data.put("username", "sabbir4hmed");
        data.put("password", "password");
        data.put("phone", "01524786417");

        Map<String, Object> namedata = new HashMap<>();

        namedata.put("firstname", "Sabbir");
        namedata.put("lastname", "Ahmed");

        data.put("name", namedata);

        return request
                .body(data)
                .post("/users");

    }






}
