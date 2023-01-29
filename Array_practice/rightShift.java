package Array_practice;


//Given array:{ 1 ,2,3,4,5}
//rotate 1 right side
//o/p  {2,3,4,5,1}


public class rightShift {

	public static void main(String[] args) {
	
	int arr[]= {1,2,4,6,8,10};
	
	int n=3;							//right shift by 1 element
	int j;
	
	for(int i=0;i<n;i++) {				//rotate loop "n"th time
		int last = arr[arr.length-1];   //stored last value #10
		for(j=arr.length-1;j>0;j--) {
			arr [j]=arr[j-1];
		}
		arr[0]=last;
	}
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
	}
}  