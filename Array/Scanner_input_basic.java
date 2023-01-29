package Array;

import java.util.Scanner;

public class Scanner_input_basic {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int size= sc.nextInt();
		
		int a[]=new int [size];	
		System.out.println("Enter the element in array : ");
		
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
				
		//int a[]= {10,58,20,8,78,60,50};
		
		for(int i=0;i<a.length;i++) {										//printing forward direction
			System.out.println(i+" printing forward direction "+a[i]);
		}
		
		for(int b:a) {														//printing elements using for each loop
			System.out.println("Array numbers are : "+ b);
		}
		
		for(int i=a.length-1;i>=0;i--) {									//Printing in reverce order
			System.out.println("Printing in reverce order : "+a[i]);
		}
		sc.close();		
	}
}
