package Exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//IO Exception occurs when input output operation is interrupted

public class Throws_IOexception {

	private String name;
	
	void display() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		System.out.println("Enter the Name here : ");
		name=br.readLine();											//readLine giving IO Exception
	}
	void show() {
		System.out.println(name);
	}
	
	
	public static void main(String[] args) throws IOException {
		Throws_IOexception t=new Throws_IOexception();
		
		t.display();
		t.show();
	}
}
