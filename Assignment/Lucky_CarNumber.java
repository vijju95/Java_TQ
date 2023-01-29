package Assignment;

public class Lucky_CarNumber {

	public static void main(String[] args) {

		int n=1234;
		int i;
		int temp=n;
		int sum=0;
		
		if(n<999 && n>9999) {
			System.out.println("Invalid number");
		}else {
			while(n>0) {
				i=n%10;
				sum=sum+i;
				n=n/10;
				System.out.println(sum);
			}if(sum%3==0 || sum%5==0 || sum%7==0) {
				System.out.println(temp + " Lucky number");
			}else
				System.out.println(temp + " Not lucky number");
			
			}		
	}
}