package Assignment;

public class Cycle {

	int accountNo;
	int noOfWheels;
	
	Cycle(){
		this(10, 12);
		System.out.println("I AM DEFAULT CONSTRUCTOR");
	}
	
	Cycle(int a,int w){
		System.out.println("I AM ANOTHER CONSTRUCTOR");
	}
	
	
	
	public static void main(String[] args) {
		Cycle c = new Cycle();
		
	}
}
