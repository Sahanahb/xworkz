class PaperBoat{
	double price;
	int capacity;
	String flavour;
	
	PaperBoat()
	{
		System.out.println("Running with no-args");
	}
	
	PaperBoat(double price)
	{
		System.out.println("Running PaperBoat with double");
		this.price=price;
	}
	
	PaperBoat(double price,int capacity)
	{
		System.out.println("Running PaperBoat with double and int ");
		this.price=price;
		this.capacity=capacity;
	}
	
	PaperBoat(double price,int capacity,String flavour)
	{
		System.out.println("Running PaperBoat with double, int and string");
		this.price=price;
		this.capacity=capacity;
		this.flavour=flavour;
	}
}