package Array_practice;

//Create class Dept(did, dname), class MyDate(day, month, year)
//a. Class Employee(emp_id, emp_name, salary, date(object),
//dept(object)). Create array of Employee and display the
//array elements.

class Dept{
	int did;
	String dname;
	
	Dept(int did,String dname){
		this.did=did;
		this.dname=dname;
	}
	
	public String toString() {
		return "Department id is : "+did+"\n"+"Department name is : "+dname;
	}
}
class MyDate{
	int emp_id;
	String emp_name;
	int salary;
	
	MyDate(int emp_id,String emp_name,int salary){
		this.emp_id=emp_id;
		this.emp_name=emp_name;
		this.salary=salary;
	}
	
	public String toString() {
		return "Employee id is : "+emp_id+"\n"+"Employee name is : "+emp_name+"\n"+"Employee salary is : "+salary;
	}
}
public class Employee {
	
	public static void main(String[] args) {
		Dept d[]=new Dept[1];
		MyDate m[]=new MyDate[1];
		
		d[0]=new Dept(24,"development");
		m[0]=new MyDate(1040,"XYZ EMP",200000);
		
		System.out.println(d[0].toString());
		System.out.println(m[0].toString());
	}

}
