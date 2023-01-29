package Static_keyword;

public class Static_method {

	int number;
	String name;
	static char division='B';

	static void change() {
		division='A';
	}
	
	Static_method(int num, String n) {
		number=num;
		name =n;
	}
	
	
	void display() {
		System.out.println(number+" "+name+" "+division);
	}
	
	public static void main(String[] args) {
		Static_method.change();						//calling of static method
		Static_method sm = new Static_method(19, "ViJaY");
		sm.display();
	}
}