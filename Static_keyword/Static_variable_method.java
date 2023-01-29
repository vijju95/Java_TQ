package Static_keyword;

public class Static_variable_method {

	static String b_name="Sapna Residency";
	int flat_no;
	int no_of_members;
	
	static char wing;
	static
	{
		 wing='A';
	}
	
	
	

	public Static_variable_method(int flat_no, int no_of_members) {
		
		this.flat_no = flat_no;
		this.no_of_members = no_of_members;
	}
	
	void display()
	{
		System.out.println("wing is..."+wing);
		System.out.println("flat no is..."+flat_no);
		System.out.println("no of members..."+no_of_members);
	}
	
	static void gardenArea()
	{
		System.out.println("gardern area common to all residents");
		
	}




	public static void main(String[] args) {
		
		b_name="Sapna Residency co.ltd";
		System.out.println("building name is...."+b_name);
		gardenArea();
		
		Static_variable_method b1=new Static_variable_method(101,3);
		
		b1.display();
		System.out.println(b1.flat_no);
		Static_variable_method b2=new Static_variable_method(102,4);
		b2.display();
		Static_variable_method b3=new Static_variable_method(103,2);
		b3.display();
		wing='C';
		Static_variable_method b4=new Static_variable_method(104,5);
		b4.display();
		
		

	}

}
