public class Video {
	private String vidName;
	private int year;
	private int copyNo;
	private double rentalRate;
	
	//source>general construtor using field
	//source> generaate getters and setters>select getters

	public Video(String vidName, int year, int copyNo, double rentalRate) {
		super();
		this.vidName = vidName;
		this.year = year;
		this.copyNo = copyNo;
		this.rentalRate = rentalRate;
	}

	public String getvName() {
		return vidName;
	}

	public int getYear() {
		return year;
	}

	public int getCopyNumber() {
		return copyNo;
	}

	public double getRentalRate() {
		return rentalRate;
	}
	
	public String tovidString() {
		return String.format("\nVideo rented: %s\n Year: %14d\n Copy No.: %10d\n\n", vidName, year, copyNo); 
	}
}