
public class Customer 
{
	private String name;
	private String street;
	private String city;
	private String state;
	private String zip;
	private int phoneNum;
	
	public Customer(String name, String street, String city, String state, String zip, int phoneNum) {
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

	public int getPhoneNum() {
		return phoneNum;
	}
	
	public String tocusString()	{
		return String.format("Customer: %s\n %s\n %s %s %s %d\n",name, street, city, state, zip, phoneNum);
							//Format: Name\n Street\n city/state/zip\n phone\n
	}
}