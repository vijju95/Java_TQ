package Array_practice;
//WAP to find min character in character array. Means 
//e.g. arr[] = [‘A’, ‘D’, ‘E’, ‘x’, ‘z’, ‘R’], so min character is ‘A’

public class MinChar {

	public static void main(String[] args) {
		
		char arr []= {'D','F','C','A','E','B'};

		char min=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					min=arr[i];
					arr[i]=arr[j];
					arr[j]=min;
				}
			}
		}
		System.out.println("Minimum character is : "+min);
	}
}

