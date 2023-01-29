package Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileReadingFIS {

	public static void main(String[] args) {
		try {
		FileInputStream fis=new FileInputStream("C:\\Users\\Admin\\OneDrive\\Desktop\\printing");
		}
		catch(FileNotFoundException e){
			System.out.println("File not found");
		}
		System.out.println("remaining code");
	}	
}
