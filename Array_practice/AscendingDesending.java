package Array_practice;

import java.util.Scanner;

public class AscendingDesending {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int size=sc.nextInt();
		
		System.out.println("Enter eleemtn of array : ");
		int arr[]=new int [size];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		//int arr[] = {56,43,12,70,86,10};
		int max=0;
		int min=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] > arr[j]) {    
					max= arr[i];    
					arr[i] = arr[j];    
					arr[j] = max;
				}
			}
		}
		System.out.println("Ascending order ~ ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
			
			
			
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] < arr[j]) {    
					min= arr[i];    
					arr[i] = arr[j];    
					arr[j] = min;
				}
			}
		}
		System.out.println("Descending order ~ ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
