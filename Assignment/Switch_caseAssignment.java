package Assignment;

import java.util.Scanner;

public class Switch_caseAssignment {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Country name : ");
		String countryName = sc.nextLine();
				
		switch (countryName) {
		
		case "INDIA" :{
			System.out.println("Hockey");
			break;
		}
		case "bangla" :{
			System.out.println("Kabadi");
			break;
		}
		case "china" :{
				System.out.println("Cricket");
				break;
		}
		case "italy" :{
			System.out.println("Football");
			break;
		}
		case "UnitedStates" :{
			System.out.println("Baseball");
			break;
		}
		}
	}
}