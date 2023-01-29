package Static_keyword;

public class Static_method_variable {

	int number;
	static float b=3.14f;
	//instance block
   {
		System.out.println(number);
		System.out.println(b);
		
	}
	//static block
	static {
		b=2.23f;
		System.out.println("static block"+b);
	}
	//static method
	static void display()
	{
		b=3.25f;
		System.out.println(b);
	}
	//constructor
	Static_method_variable(int num){
		number=num;
		System.out.println(num);
	}

	public static void main(String[] args) {

		Static_method_variable sm = new Static_method_variable(10);
		sm.display();
	}

}
