package Object_Array;

//2 Create array of students, student has (roll, name, age, marks). Print only
//Those students who have marks more than 60 and age is less than 15.

//SAME CODE

//3 WAP to print the employees from Employee[] array who has
//same salary (Create Employee class which has 3 attributes id,
//name, salary and add employee objects to your array)

class Students{
	int rollno;
	String name;
	int age;
	int mark;
	
	Students(int roll, String name,int age,int mark){
		this.rollno=roll;
		this.name=name;
		this.age=age;
		this.mark=mark;
	}
	
	public void display() {
		if(age<=15 && mark>60) {
		System.out.println(rollno+" "+name+" "+age+" "+mark);
		}
	}
}
public class SelectiveStudent {

	public static void main(String[] args) {
		
	Students [] s=new Students[4];
	
	s[0]=new Students(19,"Vijay",12,62);
	s[1]=new Students(10,"prasad",16,58);
	s[2]=new Students(11,"pranay",13,68);
	s[3]=new Students(12,"kaju",18,50);
	
	s[0].display();
	s[1].display();
	s[2].display();
	s[3].display();
	}
}
