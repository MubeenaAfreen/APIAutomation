package apiHelpers;

import pojo.GoogleLocationPojo;
import restAPIUtils.APIUtils;
import restAPIUtils.URLGenerator;

import com.google.gson.Gson;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class HelperClass {
	Gson gson = new Gson();
	APIUtils apiUtils = new APIUtils();
	URLGenerator urlGenerator = new URLGenerator();
	
	public int addLocationAPI()
	{
		int resp = 0;
		String payload = this.gson.toJson((new GoogleLocationPojo().createLocationSetter()));
		Response response = apiUtils.postCall(urlGenerator.addLocationURL, payload);
		if(response.getStatusCode() == 200)
		{
			 resp = response.getStatusCode();
		}
		else
			{
			   System.out.println("Failure while adding google location " + response.getStatusCode());
			}
		return resp;
		
	}
	
	public String getPlaceID()
	{
		String payload = this.gson.toJson((new GoogleLocationPojo().createLocationSetter()));
		Response response = apiUtils.postCall(urlGenerator.addLocationURL, payload);
		
		JsonPath json = new JsonPath(response.asString());
		String placeID = json.get("place_id");
		return placeID;
		
	}

}
