package Exception;

public class Throw_NullPointerexception {

//NullPointerException Occurs when referring to the member of null object;
	
	void display() {
		try{
			throw new NullPointerException("Explicitly thrown null pointer exception");
		}
		catch(NullPointerException ae){
			System.out.println("referring to null object : NullPointerException");
		}
	}
	
	
	public static void main(String[] args) {
		Throw_NullPointerexception t=new Throw_NullPointerexception();
		t.display();
	}
}
