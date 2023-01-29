package Object_Array;

//There is Student class { int id , string name ,Boolean isspecial , Course c 
//}Course {String cname , int fees 
//} Assume that there is array of 10 student
//objects. Write a program to set is special to be true if course fee of that
//student is more than 50000.

class Student{
	int id;
	String name;
	static String cource;
	int fees;
	Boolean isSpl;
	
	Student(int id, String name,int fees){
		this.id=id;
		this.name=name;
		this.fees=fees;
	}
	
	void show() {
		if(fees<=50000) {
			isSpl=true;
		}else
			isSpl=false;
		
		System.out.println("Student id :"+id+"\n"+"Student name : "+name+"\n"+"Student fees : "
			+fees+"\n"+"Cource name : "+"java"+"\n"+"Student is special : "+isSpl);
	}
}

public class IsSpecial {
	
	public static void main(String[] args) {
		
		Student s[]=new Student[5];
		
		s[1]=new Student(1,"PRASAD",48000);
		s[2]=new Student(2,"VIJAY",52000);
		s[3]=new Student(3,"PRANAY",50000);
		s[4]=new Student(4,"KAJU",60000);
		
		s[1].show();
		s[2].show();
		s[3].show();
		s[4].show();
		
	}
}
