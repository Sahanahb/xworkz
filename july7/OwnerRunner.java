class OwnerRunner{
	public static void main(String[] args){
						System.out.println(" ");
		System.out.println("Running main in OwnerRunner...");
		System.out.println(" ");
		
		System.out.println("calling 1st constructor from OwnerRunner...");
	    Owner ref1 = new Owner("Sahana" , 7022573221, 22 , "female" , 459999.9);
	    ref1.info();
		System.out.println(" ");

	
			
	    System.out.println("calling 2nd constructor from OwnerRunner...");
        Owner ref2 = new Owner("Murali" , 9113087093, 23 , "male" , 559999.9);
	    ref2.info();
		System.out.println(" ");
	
	
	    System.out.println("calling 3rd constructor from OwnerRunner...");
        Owner ref3 = new Owner("Kruthika" , 94453323l , 24 , "female" , 419999.9);
	    ref3.info();
		System.out.println(" ");

	}
}
