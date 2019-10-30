package pojo;

public class GoogleLocationPojo {
	private double lat;
	private double lng;
	private int accuracy;
	private String name;
	private String phone_number;
	private String address;
	//private String types;
	private String website;
	private String language;
	
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	public double getLng() {
		return lng;
	}
	public void setLng(double lng) {
		this.lng = lng;
	}
	public int getAccuracy() {
		return accuracy;
	}
	public void setAccuracy(int accuracy) {
		this.accuracy = accuracy;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	/*public String getTypes() {
		return types;
	}
	public void setTypes(String types) {
		this.types = types;
	}*/
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	
	public GoogleLocationPojo createLocationSetter()
	{
		GoogleLocationPojo addLocation = new GoogleLocationPojo();
		addLocation.setLat(-38.383494);
		addLocation.setLng(33.427362);
		addLocation.setAccuracy(50);
		addLocation.setName("Frontline house");
		addLocation.setPhone_number("(+91) 983 893 3937");
		addLocation.setAddress("29, side layout, cohen 09");
		//addLocation.setTypes("shoepark shop");
		addLocation.setWebsite("http://google.com");
		addLocation.setLanguage("French-IN");
		return addLocation;
		
	}

}
