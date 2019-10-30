package restAPIUtils;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class APIUtils {
	
	public Response postCall(String url, String body)
	{
		Response response = (Response) RestAssured.given()
				.header("Content-Type", "application/json")
				.queryParam("key", "qaclick123")
				.body(body)
				.post(url);				
		return response;
		
	}

}
