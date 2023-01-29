package Exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Assignment extends Exception{

	public Assignment(String string) {
		// TODO Auto-generated constructor stub
	}

	// question number one
	void observeException() {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[7]);
		}
	}

	// WAP to use catch / handle the ArrayIndexOutOfBoundsException exception
	void handleAIOB() {
		try {
			int arr[] = { 1, 2, 3, 5, 4, 6, 8, 7, 5, 6 };
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[12]);
			}
		} catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println("Exception is handled");
		}
	}

	// WAP to catch multiple exceptions. i.e ArrayIndexOutOfBoundsException and
	// ArithmeticException
	void multipleException() {
		int arr[] = { 1, 2, 3, 4, 5 };
		int a = 10, b = 2;
		try {
			int c = a / b;
			System.out.println(c);
			System.out.println(arr[8]);
		} catch (ArithmeticException are) {
			System.out.println("arithmetic handled");
			are.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println("AIOOB handled");
			ae.printStackTrace();
		}
	}

	// WAP to show checked exception and use multiple catch block with universal
	// Exception handler
	void universalException() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter string here : ");
		String s = br.readLine();
		char[] ch = s.toCharArray();
		try {
			for (int i = 0; i < ch.length; i++) {
				System.out.println(ch[100]);
			}
		} catch (StringIndexOutOfBoundsException ae) {
			System.out.println("SIOOB Exception is handled");
		} catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println("AIOOB Exception is handled");
		} catch (Exception e) {
			System.out.println("Universal exception handler");
		}
	}

	// WAP to show throw and throws keyword//throws in universal exception
	// program...
	void throwAssignment() {
		try {
			throw new NullPointerException("Explicitly thrown null pointer exception");
		} catch (NullPointerException ae) {
			System.out.println("referring to null object : NullPointerException");
		}
	}

	// WAP to show ClassNotFoundException
	void classNF() throws ClassNotFoundException {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException ce) {
			System.out.println("CNFEhandled");
			ce.printStackTrace();
		}
	}

	// Create 3 array which shows int acc[]{1001,1002,1003,1004,1005} string anme[]={"ram","shyam","payal","pooja","sonam"};
	// int balance[]={1000,2000,3000,999,5000} create a method check() which will check the balance and if balance is less thn 1000 its should throw InsufficientBalanceException
	
	void userdefineException() {
		int acc[]={1001,1002,1003,1004,1005};
		String name[]={"ram","shyam","payal","pooja","sonam"};
		int balance[]={1000,2000,3000,999,5000};
		
		try {
			for(int i=0;i<balance.length;i++) {
				if(balance[i]<1000) {
					Assignment ae=new Assignment("InsufficientBalanceException");
					throw ae;
				}else
					System.out.println("sufficient balance");
			}
		}catch(Assignment ae) {
			ae.printStackTrace();
		}
		}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Assignment a = new Assignment(null);
		//a.userdefineException();
		// a.classNF();
		// a.throwAssignment();
		// a.universalException();
		// a.observeException();
		// a.handleAIOB();
		// a.multipleException();
	}

}
