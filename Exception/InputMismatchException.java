package Exception;

import java.util.Scanner;

public class InputMismatchException {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enterr number here : ");
		int num=sc.nextInt();
		//instead of number inter char or string 
		System.out.println(num);
	}
}
