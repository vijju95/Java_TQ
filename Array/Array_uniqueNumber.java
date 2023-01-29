package Array;

import java.util.Scanner;

public class Array_uniqueNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of array : ");
		int num=sc.nextInt();
		
		int n[]=new int [num];
		System.out.println("Enter number : ");
		
		for(int i=0;i<n.length;i++) {
			n[i]=sc.nextInt();
		}
			
			for(int i=0;i<n.length;i++) {
				int count =0;
				for(int j=i+1;j<n.length;j++) {
					if(n[i]==n [j]) {
						count++;
					}
				}
				if(count>=1)
					System.out.println(n[i]+" "+count);
			}
	}
}
