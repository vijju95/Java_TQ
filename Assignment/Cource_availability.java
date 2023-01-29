package Assignment;

import java.util.Scanner;

//IIHT institution is offering a variety of courses to students. Students have a facility to check whether a particular course is available in the institution. 
//Write a program to help the institution accomplish this task.
//
//Enter no of course:
//5
//Enter course names:
//Java
//Oracle
//C++
//Mysql
//Dotnet
//Enter the course to be searched:
//C++

public class Cource_availability {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter cource name : ");
		String name = sc.nextLine();
		
//		String name="JAVA";
		
		String c1="SQL";
		
		if(c1.equals(name)) {
			System.out.println("Cource is availaible");
		}
		else if("ORACLE".equals(name)) {
			System.out.println("Not available");
		}
		else if(name.equals("c++")) {
			System.out.println("Cource is availaible");
		}
		else if(name.equals("JAVA")) {
			System.out.println("Cource is availaible");
		}
		else if(name.equals("DOTNET")) {
			System.out.println("Cource is availaible");
		}
	sc.close();
	}
}
