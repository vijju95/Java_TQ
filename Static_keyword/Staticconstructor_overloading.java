package Static_keyword;

public class Staticconstructor_overloading {

	static void product (String a) {
		System.out.println("FIRST PRODUCT IS...  "+a);
	}
	
	static void product (String b, String c) {
		
		System.out.println("Second product is...  "+b+" "+c);
	}
	
	public static void main(String[] args) {

	product("MILK");
	//product("RICE","COOK");
	}
}
//due to use of static key word not req to make object of the class we can directly call through method name