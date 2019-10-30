package RestAssured;

import org.testng.annotations.Test;

import apiHelpers.HelperClass;

public class AddDeleteGoogleAPI {
	HelperClass helper = new HelperClass();
	
	@Test
	public void addDeleteAPI()
	{
		
		System.out.println(helper.getPlaceID());
	}
   
}
