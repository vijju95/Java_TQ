package Assignment;

import java.util.Scanner;

public class Theater_SwichCase {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter customer name : ");
		String customer=sc.nextLine();
		
		System.out.println("Available Menu : : ");
		System.out.println("1. Pizza : 100 rs/Piece");
		System.out.println("2. Puffs : 20 rs/Piece");
		System.out.println("3. ColdDrink : 10 rs/Piece");
		
		int choice=0;
		int sum=0, sum1=0, sum2=0, sum3=0;
		
		
		System.out.println("Select any option from above to continue : ");
		choice=sc.nextInt();
				
		switch (choice) {
		
		case 1 :{
			System.out.println("Enter quantity of pizza's : ");
			int num1=sc.nextInt();
			int price=100;
			sum1=price*num1;
		}
		case 2 :{
			System.out.println("Enter quantity of puff's : ");
			int num2=sc.nextInt();
			int price=20;
			sum2=price*num2;
		}
		case 3 :{
			System.out.println("Enter quantity of colddrink's : ");
			int num3=sc.nextInt();
			int price=10;
			sum3=price*num3;
		}
		sum=sum1+sum2+sum3;
		System.out.println("Customer name is "+ customer + " Total bill paid : "+ sum);
		System.out.println("Thank you visit again!");
		}
		sc.close();
	}

}
