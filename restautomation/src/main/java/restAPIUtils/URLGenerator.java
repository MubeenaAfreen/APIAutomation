package restAPIUtils;

public class URLGenerator {
	
	public String addLocationURL = "/maps/api/place/add/json";
	
	
	public URLGenerator()
	{
		String baseURL = "http://216.10.245.166";
		this.addLocationURL = baseURL + this.addLocationURL;
	}

}
