package Array_practice;

import java.util.Scanner;

public class Array {
	
	void decalre() {
		
//		String s= "asfgdghf";
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enterr string :");
//		int size=sc.nextInt();
//		
//		System.out.println("enter string here : ");
//		String s=sc.next();
		
//		Scanner sc=new Scanner(System.in);
//		String s=sc.next();
		
		
		
		
//		System.out.println(s);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//Merge two array into one array
	public void third() {
		int arr[]= {1,2,3,6,5,7,10};
		int arr3[]=new int[arr.length];
		int j=0;
		for(int i=0;i<arr.length;i++) {
			 if(arr[i]%2==0) {
				 arr3[j]=arr[i];
				 j++; 
			 }	 
		}
		for(int i=0;i<arr.length;i++) {
			 if(arr[i]%2!=0) {
				 arr3[j]=arr[i];
				 j++;				 
			 }			 
		}
		for(int i=0;i<arr3.length;i++) {
			System.out.println(arr3[i]);
		}
	}
		//PRINT ALTERNATE VALUE FROM THE ARRAY
		public void Alternate() {

		Scanner sc=new Scanner(System.in);
		System.out.println("Size of array : ");
		int size=sc.nextInt();
		
		System.out.println("Enter the elements : ");
		int arr[]=new int [size];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				System.out.println(arr[i]);
			}
		}
		}
		
		//COUNT OF REPEATED ELEMENT IN ARRAY
		public void repeat() {
			Scanner sc=new Scanner(System.in);
			System.out.println("Size of array : ");
			int size=sc.nextInt();
			
			System.out.println("Enter the elements : ");
			int arr[]=new int [size];
			
			for(int i=0;i<arr.length;i++) {
				arr[i]=sc.nextInt();
			}
			
		for(int i=0;i<arr.length;i++) {
			int count=0;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			System.out.println(arr[i]+" "+count);
		}
		}
		
		//NUMBER IS PRESENT IN ARRAY OR NOT
		public void Number() {
			Scanner sc=new Scanner(System.in);
			System.out.println("Size of array : ");
			int size=sc.nextInt();
			
			System.out.println("Enter the elements : ");
			int arr[]=new int [size];
			
			for(int i=0;i<arr.length;i++) {
				arr[i]=sc.nextInt();
			}
			
		for(int i=0;i<arr.length;i++) {
			int num=12;
			if(num==arr[i]) {
				System.out.println("Number is present : "+" "+num);
			}
		}
		}
	
		public static void main(String[] args) {
			Array a = new Array();
			a.decalre();
			//a.third();
			//a.Alternate();
			//a.Number();
			//a.repeat();
		}
}
