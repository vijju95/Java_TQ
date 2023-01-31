package Exception;

public class InsufficientBalanceException extends Exception {

	// Create 3 array which shows int acc[]{1001,1002,1003,1004,1005} string
	// anme[]={"ram","shyam","payal","pooja","sonam"};
	// int balance[]={1000,2000,3000,999,5000} create a method check() which will
	// check the balance and if balance is less thn 1000 its should throw
	// InsufficientBalanceException

	static int balance[] = { 1000, 2000, 3000, 999, 5000 };
	static String[] name = { "ram", "shyam", "payal", "pooja", "sonam" };
	static int acc[] = { 1001, 1002, 1003, 1004, 1005 };
	static int i = 0;

	void check() throws InsufficientBalanceException {
		for (i = 0; i < acc.length; i++) {
			try {
				if (balance[i] < 1000) {
					throw new InsufficientBalanceException();
				} else
					System.out.println(acc[i] + " " + name[i] + " " + balance[i]);
			} catch (InsufficientBalanceException e) {
				System.out.println("Balance is low");
			}
		}
	}

	public static void main(String[] args) throws InsufficientBalanceException {
		InsufficientBalanceException c = new InsufficientBalanceException();

		c.check();
	}
}
