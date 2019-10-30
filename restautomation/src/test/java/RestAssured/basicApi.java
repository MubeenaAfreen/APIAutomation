package RestAssured;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class basicApi 
{
	
/*	public static void main(String args[])
	{
		RestAssured.baseURI = "http://dummy.restapiexample.com";		
		given().
		   param("").
		when().
		   get("/api/v1/employees").
		then().
		    assertThat().statusCode(200);
		
	}*/

	@Test
	public void WeatherMessageBody()
	{
	 RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
	 RequestSpecification httpRequest = RestAssured.given();
	 Response response = httpRequest.get("/Hyderabad");
	 
	 // Retrieve the body of the Response
	 ResponseBody body = response.getBody();
	 
	 // To check for sub string presence get the Response body as a String.
	 // Do a String.contains
	 String bodyAsString = body.asString();
	 Assert.assertEquals(bodyAsString.contains("Hyderabad") /*Expected value*/, true /*Actual Value*/, "Response body contains Hyderabad");
	}
}
