package Base;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class BaseService {

    protected RequestSpecification request;

    public BaseService()
    {
        RestAssured.baseURI = "https://fakestoreapi.com/";

        request = RestAssured.given()
                .header("Content-Type","application/json");
    }

}
