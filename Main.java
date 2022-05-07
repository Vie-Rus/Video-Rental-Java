public class Main {
	public static void main(String[] args)
	{


		System.out.print("ACME Video Rental Invoice\n");
		
		
		
		Customer cust = new Customer("Fox Jr", "210 Main street","Weiney", "PA", "44237\n", 438946235);

		
		//Customer good!
		
		
		Video vid = new Video("X-Files", 1995, 002, 20.50);

		
			//Video good!
	
		Invoice inv = new Invoice(cust, vid, "3.95", 8);
		
		System.out.print(cust.tocusString() + vid.tovidString() + inv.toinvString());
	}
}