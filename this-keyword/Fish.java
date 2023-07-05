class Fish{
	String name = "Bhuthai" ;
	String type ;
	double price ;
	String location;
	
	Fish(){
		System.out.println("Fish running with no arguments :");
	}
	
	Fish(String name){
		System.out.println("Fish running with String argument :");
		this.name = name;
	}
	
	Fish(String name ,String type,double price){
		System.out.println("Fish running with string,string,double arguments :");
		this.name = name;
		this.type = type;
		this.price = price;
	}
	
	Fish(String name ,String type,double price,String location){
		System.out.println("Fish running with string,string,double,string arguments :");
		this.name = name;
		this.type = type;
		this.price = price;
		this.location = location;
	}
}	