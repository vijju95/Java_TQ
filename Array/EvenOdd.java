package Array;

public class EvenOdd {
	
		public static void main(String[] args) {
			int arr[]= {1,2,3,6,5,7,10};
			int arr1[]=new int[arr.length];
			
			int j=0;
			
			for(int i=0;i<arr.length;i++) {
				 if(arr[i]%2==0) {
					 arr1[j]=arr[i];
					 j++; 
				 }
			}
			for(int i=0;i<arr.length;i++) {
				 if(arr[i]%2!=0) {
					 arr1[j]=arr[i];
					 j++; 
				 }
			}
			
			for(int i=0;i<arr1.length;i++){
				System.out.println(arr1[i]);
			}
		}
}