package Assignment;

public class Account_assignment {

	int account_no;
	int balance;
	int deposit_money, withdraw_money;
	
	public void insert() {
		account_no=4044;
		balance=20000;
	}
	
	public void display() {
		System.out.println(account_no);
	}
	
	public void deposit() {
		deposit_money=5000;
		balance=balance+deposit_money;
		System.out.println(balance);
	}
	
	public void withdraw() {
		withdraw_money=10000;
		if(withdraw_money<balance)
			balance=balance-withdraw_money;
		System.out.println(balance);
	}
	
	public static void main(String[] args) {
		Account_assignment a = new Account_assignment();
		a.insert();
		a.display();
		a.deposit();
		a.withdraw();
	}
}
