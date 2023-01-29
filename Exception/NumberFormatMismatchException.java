package Exception;

public class NumberFormatMismatchException {
//NumberFormatException occurs due to the inappropriate format of string for the corresponding argument of the method which is throwing the exception
	public static void main(String[] args) {  
		String b=" ";
		
		try {
        int a = Integer.parseInt(b); 
		}catch(NumberFormatException ne) {
			System.out.println("Num Formatt Exception handled");
			ne.printStackTrace();
		}
   }  
}
/*The input string provided might be null-
Example- Integer.parseInt(null);
The input string might be empty-
Example- Integer.parseInt("");
The input string might be having trailing space-
Example- Integer.parseInt("123 ");
The input string might be having a leading space-
Example- Integer.parseInt(" 123");
The input string may be alphanumeric-
Example- Long.parseLong("b2");
The input string may have an input which might exceed the range of the datatype storing the parsed string-
Example- Integer.parseInt("135"); The maximum possible value of integer can be 127, but the value in the string is 135 
which is out of range, so this will throw the exception.
There may be a mismatch between the input string and the type of the method which is being used for parsing. 
If you provide the input string like "1.0" 
and you try to convert this string into an integer value, it will throw a NumberFormatException exception.
Example- Integer.parseInt("1..0");*/