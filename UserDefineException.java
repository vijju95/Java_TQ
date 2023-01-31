package Exception;

import java.util.Scanner;

public class UserDefineException extends Exception {

	String name = "ViJaY KaPsE";
	static int balance = 1000;
	int acc_number = 4044;
	static int credit;

	UserDefineException(String s) {
	}

	public static void main(String[] args) {

		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter amount to be credit : ");
			credit = sc.nextInt();
			balance = balance + credit;

			if (credit < 100) {
				UserDefineException ue = new UserDefineException("Amount enter is short to complete transaction>>>");
				throw ue;
			} else
				System.out.println("Amount is credited avail balance is : " + balance);
		} catch (UserDefineException ue) {
			ue.printStackTrace();
			ue.toString();
			ue.getMessage();
		}

	}
}
