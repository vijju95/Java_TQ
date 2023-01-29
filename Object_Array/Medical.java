package Object_Array;

import java.util.Scanner;

class medicines{
	String name;
	int price;
	
	medicines(String name, int price){
		this.name=name;
		this.price=price;
	}
	
	public void show() {
		System.out.println("name of medicine is : "+name+'\n'+"Price of the medicine is : "+price+"rs");
	}
}

public class Medical {

	public static void main(String[] args) {
		
		medicines[] m=new medicines[3];
		
		m[0]=new medicines("paracetamol", 10);
		m[1]=new medicines("dolo", 3);
		m[2]=new medicines("ocacet", 15);
		
		System.out.println("Medicine 1st ~");
		m[0].show();
		System.out.println("Medicine 2nd ~");
		m[1].show();
		System.out.println("Medicine 3rd ~");
		m[2].show();

	}
}
