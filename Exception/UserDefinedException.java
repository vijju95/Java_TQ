package Exception;

import java.util.Scanner;

public class UserDefinedException extends Exception{
	
	
	UserDefinedException(String age){
		super(age);
	}
	

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age : ");		
		int age=sc.nextInt();
		
		try {
			if(age<18) {
				System.out.println("Unable to vote");
				UserDefinedException ue=new UserDefinedException("Age of voter is less than 18 ");
				throw ue;
			}
			System.out.println("Go for voting");
		}
		catch(UserDefinedException ue){
			ue.printStackTrace();
			ue.toString();
			ue.getMessage();
		}		
	}
}
