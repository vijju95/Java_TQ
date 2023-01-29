package Exception;


public class PracticeException {

	public void display() {

		try {
			int a = 10;
			int b = 0;
			int c = a / b;
			System.out.println(c);
		} catch (Exception e) {

			System.out.println("exception handled");
		} finally {
			System.out.println("Finally block imp pend task");
		}
	}

	void afterException() {
		System.out.println("Didffrent method");
	}

	void anotherException() {
		int a[] = { 1, 2, 3, 4, 5 };
		System.out.println(a[6]);
	}

	public static void main(String[] args) {
		PracticeException p = new PracticeException();
		p.display();
		p.afterException();
		try {
			p.anotherException();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("I am handling in main method AIOBE");
		} catch (NullPointerException e) {
			System.out.println("I am handling null pointer exception");
		} finally {
			System.out.println("D.driver.close or driver.refresh");
		}
	}
}
