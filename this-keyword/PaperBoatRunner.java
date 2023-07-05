class PaperBoatRunner{
	public static void main(String[] args) 
    {
        System.out.println("running main of PaperBoatRunner");
		
		PaperBoat ref=new PaperBoat();
        System.out.println("Name: "+ref.price);
        System.out.println("Color: "+ref.capacity);
        System.out.println("Type: "+ref.flavour);
		
		PaperBoat ref1=new PaperBoat(20.00);
        System.out.println("Name: "+ref1.price);
        System.out.println("Color: "+ref1.capacity );
        System.out.println("Type: "+ref1.flavour);
        
		
		PaperBoat ref2=new PaperBoat(20.00,250);
        System.out.println("Name: "+ref2.price);
        System.out.println("Color: "+ref2.capacity );
        System.out.println("Type: "+ref2.flavour);
        
		
		PaperBoat ref3=new PaperBoat(45.00,2,"Guava");
        System.out.println("Name: "+ref3.price);
        System.out.println("Color: "+ref3.capacity );
        System.out.println("Type: "+ref3.flavour);
	}   
}