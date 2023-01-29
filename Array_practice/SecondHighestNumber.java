package Array_practice;

public class SecondHighestNumber {

	public static void main(String[] args) {
		
	int arr[]= {1,2,3,4,5,6,7};
	int n=2, sum=0, max=0;
	for(int i=0;i<n;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]<arr[j]) {
				max=arr[i];
				arr[i]=arr[j];
				arr[j]=max;
			}
		}
	}
		System.out.println(arr[1]);	
		for(int i=1;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		System.out.println(sum);
	}
}

