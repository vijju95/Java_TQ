package Static_keyword;

public class Static_variable {
// example of variable after using static keyword
	int number;
	String name;
	static String mobinet="WIFI";
	
	Static_variable(int n,String na){
		number=n;
		name=na;
	}
	void display() {
		System.out.println(number+" "+name+" "+mobinet);
	}
	
	public static void main(String[] args) {
		Static_variable sv = new Static_variable(19 , "Vijay");
		sv.display();
	}
}
