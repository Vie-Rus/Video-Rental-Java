
public class Customer 
{
	private String name;
	private String street;
	private String city;
	private String state;
	private String zip;
	private String phoneNum;
	
	public Customer(String name, String street, String city, String state, String zip, String phoneNum) {
		
		super();
		this.name = name;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNum = phoneNum;
		
	}

	public String getName() {
		return name;
	}

	public String getStreet() {
		return street;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getZip() {
		return zip;
	}

	public String getPhoneNum() {
		return phoneNum;
	}
	
	public String tocusString()
	{
		return String.format("%s \n%s \n%s, %s %s\n%s",name, street, city, state, zip, phoneNum);
	}

	
	//source>general construtor using field
	//source> generaate getters and setters>select getters
}

