class Metro{
	String line;
	int distance;
	String start;
	String destination;
	int capacity;
	
	Metro(String line) {
		System.out.println(" Metro running with String argument :");
		this.line=line;
	}
	
	Metro(String line, int distance) {
		this(line);
		System.out.println(" Metro running with String and int argument :");
		this.distance=distance;
	}

	Metro(String line, int distance, String start) {
		this(line,distance);
		System.out.println(" Metro running with String, int and String argument :");
		this.start=start;
	}
	
	Metro(String line, int distance, String start, String destination) {
		this(line,distance,start);
		System.out.println(" Metro running with String, int, String and String argument :");
		this.destination=destination;
	}
	Metro(String line, int distance, String start, String destination, int capacity) {
		this(line,distance,start,destination);
		System.out.println(" Metro running with String, int, String, String and int argument :");
		this.capacity=capacity;
	}
}

		