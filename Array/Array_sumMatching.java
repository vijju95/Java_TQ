package Array;

public class Array_sumMatching {

	public static void main(String[] args) {
		int [] num= {5,2,6,8,5,9,3,4};
		
		int sum=7;
		
		for(int i=0;i<num.length;i++) {
			
			for(int j=i+1;j<num.length;j++) {
				
				int nextsum=num[i]+num[j];
				
				if(nextsum==sum) {
					System.out.println("Pair of matching is : "+num[i]+" + "+num[j]);
				}
			}
		}
		
	}
}
