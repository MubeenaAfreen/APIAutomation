package RestAssured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class GetPlacesAPI {

	@Test
	public void getplace()
	{
		RestAssured.baseURI = "https://maps.googleapis.com";
		Response res = RestAssured.given().
				param("location","-33.8670522, 151.1957362" ).
				param("radius", "500").
				param("key", "AIzaSyDIQgAh0B4p0SdyYkyW8tlG-y0yJMfss5Y").
				when().get("/maps/api/place/nearbysearch/json").
				then().assertThat().statusCode(200).
				//body("results[0].name", equalTo("Sydney")).
				extract().response();
          String resp = res.asString();
          JsonPath js = new JsonPath(resp);
          int count = js.get("results.size()");
          System.out.println(count);
          for(int i=0; i<count ;i++)
          {
        	  System.out.println(js.get("results["+i+"].name"));
          }
				
				
	}
}
