package Assignment;

public class Assignment_NIT {
	/*
	 * Create a class Student with the private attributes int studentId String
	 * studentName, studentAddress, collegeName. Include appropriate getter methods.
	 * Assume most of the students are from “NIT” college. So user has to give input
	 * whether the student is from NIT or not. If student belongs to NIT, give input
	 * as 'yes/YES' and skip input for the attribute collegeName and create student
	 * object with 3-argument constructor to initilze the values for studentId,
	 * studentName and studentAddress and collegeName as “NIT”. If student belongs
	 * to other college, give input as 'no/NO' and get college name from the user
	 * and create student object with 4-argument constructor to initialize all the
	 * values. Instead of Yes / No, if user enters different input then display
	 * 'Wrong Input' and get the input again. Based on the above assumptions write
	 * the necessary constructors in the Student class. Write a class StudentMain
	 * with the main method and test the application.
	 */

	private int studentId;
	private String studentName;
	private String studentAddress;
	private String collegeName;
	
	
	public void setS_id(int s) {
		studentId=s;
	}
	int getS_id() {
		return  studentId;
	}
	
	public void setS_name(String n) {
		studentName=n;
	}
	String getS_name() {
		return  studentName;
	}
	
	public void setS_address(String a) {
		studentAddress=a;
	}
	String getS_address() {
		return  studentAddress;
	}
	
	public void setS_college(String c) {
		collegeName=c;
	}
	String getS_college() {
		return  collegeName;
	}
	
}
