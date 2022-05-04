public class Video {
	private String vName;
	private int year;
	private int copyNumber;
	private double rentalRate;
	
	public Video(String vName, int year, int copyNumber, double rentalRate) {
		super();
		this.vName = vName;
		this.year = year;
		this.copyNumber = copyNumber;
		this.rentalRate = rentalRate;
	}

	public String getvName() {
		return vName;
	}

	public int getYear() {
		return year;
	}

	public int getCopyNumber() {
		return copyNumber;
	}

	public double getRentalRate() {
		return rentalRate;
	}
	
	public String tovidString()
	{
		return String.format("\n\nVideo rented: %s\nYear: %14d\nCopy No.: %7d", vName, year, copyNumber ); 
	}

	//source>general construtor using field
	//source> generaate getters and setters>select getters
}
