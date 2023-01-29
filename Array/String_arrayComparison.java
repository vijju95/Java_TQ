package Array;

import java.util.Scanner;

public class String_arrayComparison {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the arrray size : ");
		int size=sc.nextInt();
		String arr[]=new String[size];
		System.out.println("Enter the elements : ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.next();
		}
		
		
		int flag = 0;
		System.out.println("Enter string want to compare : ");
		String neww = sc.next();
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i].equals(neww)) {
				flag=1;
				if(flag==1) 
					System.out.println("Given input is matching with the element ^^ ");
			}
		}
	}
}
