
public class Invoice {
	private Customer customer;
	private Video video;
	private String dateRented;
	private int numberDays;
	
	public Invoice(Customer cust, Video video, String dateRented, int numberDays) {
		super();
		this.customer = cust;
		this.video = video;
		this.dateRented = dateRented;
		this.numberDays = numberDays;
	}

	public Customer getCus() {
		return customer;
	}

	public Video getVid() {
		return video;
	}

	public String getDateRented() {
		return dateRented;
	}

	public int getNumberDays() {
		return numberDays;
	}

	public double subTotal() {
		return numberDays * video.getRentalRate();
	}
	
	public double tax() {
		return subTotal() * 0.06;
	}
	
	public double total() {
		return subTotal() + tax();
	}
	
	public String toinvString() {
		return String.format("Invoice:\n Daily Rate:%12s\n Days Rented: %7d\n-------------------------\nSubtotal %15.2f\nTax %20.2f\n-------------------------\nTotal %18.2f\n\n",dateRented, numberDays, subTotal(), tax(), total()); 
	}
}