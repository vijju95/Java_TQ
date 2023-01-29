package Array;

import java.util.Scanner;

public class Delete_elementArray {

	    public static void main(String[] args) {
// # logic = take array declare one variable j to delete that index element 
// take loop from that j element upto length and increase new array size by 1 to remove that j value
// now final normal loop
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("Size of array : ");
	    	int size=sc.nextInt();
	    	
	    	System.out.println("Enter the elements : ");
	    	int arr[]=new int[size];
	    	
	    	for(int i=0;i<arr.length;i++) {
	    		arr[i]=sc.nextInt();
	    	}
	    	int index=2;
	    	for(int i=index;i<arr.length-1;i++) {//to print number from deleted number accepting deleted number
	    		arr[i]=arr[i+1];
	    	}
	    	
	    	for(int i=0;i<arr.length;i++) {
	    		System.out.println(arr[i]);
	    	}
	    }
}
