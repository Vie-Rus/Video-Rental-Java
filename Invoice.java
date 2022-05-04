
public class Invoice {
	private Customer cust;
	private Video vid;
	private String dateRented;
	private int numberDays;
	
	public Invoice(Customer cus, Video vid, String dateRented, int numberDays) {
		super();
		this.cust = cus;
		this.vid = vid;
		this.dateRented = dateRented;
		this.numberDays = numberDays;
	}

	public Customer getCus() {
		return cust;
	}

	public Video getVid() {
		return vid;
	}

	public String getDateRented() {
		return dateRented;
	}

	public int getNumberDays() {
		return numberDays;
	}

	public double subTotal() {
		return numberDays * vid.getRentalRate();
	}
	
	public double tax() {
		return subTotal() * 0.06;
	}
	
	public double total() {
		return subTotal() + tax();
	}
	
	
	public String toinvString()
	{
		return String.format("\n\nDaily Rate:%13s\nNumber of days %6d\n\nSubtotal %15.2f\nTax %20.2f\nTotal %18.2f",dateRented, numberDays, subTotal(), tax(), total()); 
	}
	
	//source>general construtor using field

	//source> generaate getters and setters>select getters






}
