package RestAssured;

import javax.sql.rowset.WebRowSet;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;

public class GoogleAPI 
{	
	@Test
	public void addLocation()
	{
		RestAssured.baseURI = "http://216.10.245.166" ;
		
		Response response = RestAssured.given().queryParam("key", "qaclick123").body("{" +
 
    "\"location\":{" +
 
        "\"lat\" : -38.383494," +
 
        "\"lng\" : 33.427362" +
 
    "}," +
 
    "\"accuracy\":50," +
 
    "\"name\":\"Frontline house\"," +
 
    "\"phone_number\":\"(+91) 983 893 3937\"," +
 
    "\"address\" : \"29, side layout, cohen 09\"," +
 
    "\"types\": [\"shoe park\",\"shop\"]," +
 
    "\"website\" : \"http://google.com\"," +
 
    "\"language\" : \"French-IN\"" +
 
    "}").when().request("post", "maps/api/place/add/json");
	    // then().assertThat().statusCode(200).and().;			
				
		Assert.assertEquals(response.getStatusCode(), 200);
		//System.out.println(response.prettyPrint());
		System.out.println(response.getHeader("Date"));

	}
}
