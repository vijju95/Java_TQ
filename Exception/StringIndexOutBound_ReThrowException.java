package Exception;

	
class A{
	void show() {
				
		try {
			String s="ViJaY";
			
			System.out.println(s.charAt(6));
		}
		catch(StringIndexOutOfBoundsException ae){
			System.out.println("Catched SIOOB Exception");
			throw ae;
		}
	}
}
public class StringIndexOutBound_ReThrowException{
	public static void main(String[] args) {
		A a=new A();
			try {
				a.show();
			}
			catch(StringIndexOutOfBoundsException ae) {
				System.out.println("Re-throwed exception is handles");
			}
	}
}