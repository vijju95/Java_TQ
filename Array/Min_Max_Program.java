package Array;

import java.util.Scanner;

public class Min_Max_Program {
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter array size : ");
	int size=sc.nextInt();
	
	System.out.println("Eter the elements of array : ");
	int a[]=new int [size];
	
	for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
	}
	
	int max=a[0];
	for(int i=0;i<a.length;i++) {
		if(max<a[i]) {
			max=a[i];
		}
	}
	System.out.println("Maximum no of array is : "+max);
	
	int min=a[0];
	for(int i=0;i<a.length;i++) {
		if(min>a[i]) {
			min=a[i];
		}
	}
	System.out.println("Minimum no of array is : "+min);
	}
}
