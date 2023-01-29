package Object_Array;

//Employee class with fields (empno, empname, dept) where dept is object of
//department class with fields (deptId, deptname) Write a program to create
//array of 3 employees each employee will have different department.

class Details{
	
	int empNo;
	String empName;
	static String empDept;
	
	Details(int empNo,String empName){
		this.empNo=empNo;
		this.empName=empName;
	}
	
	void display() {
		System.out.println("Employee num is : "+empNo+"\n"+"Employee name is : "+empName+"\n"+"Employee dept is : "+"Development");
	}
}

public class Employee {

	public static void main(String[] args) {
		Details d[]=new Details[3];
		
		d[0]=new Details(1,"vijay");
		d[1]=new Details(2,"prasad");
		d[2]=new Details(3,"pranay");
		
		d[0].display();
		d[1].display();
		d[2].display();
	}
}
