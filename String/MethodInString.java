package String;

import java.util.Arrays;

public class MethodInString {

	//ToLowercase method
	void lowercase() {
		String s="CASE";
		char ch[]=s.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
				ch[i]=(char) (ch[i]+32);
		}
		String s1=new String(ch);
		System.out.println(s1);
	}
	
	// To find count of the element
	void methodCount() {
		String s = "Hello";
		int count = 0;
		char ch[] = s.toCharArray(); // convert string to char array;
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]); // print elements in string
			count++;
		}
		System.out.println(count); // print count of element
	}

	// to print the string in reverce order
	void reverceString() {
		String s = "Good Morning D";

		char ch[] = s.toCharArray();

		for (int i = ch.length - 1; i >= 0; i--) {
			System.out.println(ch[i]);
		}
	}

	// print array on lower case same for upper (-32) ;;;
	void lowerCase() {
		String s = "HELLO WORLD";

		char ch[] = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			ch[i] = (char) (ch[i] + 32);
		}
		String str = new String(ch);
		System.out.println(str);
	}

	// Concate join the two string
	void concate() {
		String s = "Hello";

		String c = s.concat("Java");
		System.out.println(c);
	}

	// Compare to method
	void compareTo() {
		String s = "India";
		System.out.println(s.compareTo("India"));// op is 0 if it's true if wrong then it print diffrence of them
	}

	// Arranging sequencially and charAt(0) method and swapping technique
	void sequence() {
		String s[] = { "Date", "Apple", "Carrob", "Banana" };

		for (int i = 0; i < s.length; i++) {
			for (int j = i + 1; j < s.length; j++) {
				if (s[i].charAt(0) > s[j].charAt(0)) {
					String temp = s[i];
					s[i] = s[j];
					s[j] = temp;
				}
			}
			System.out.println(s[i]);
		}
	}

	// Assignment sort string by elements count
	void Count() {
		String s[] = { "it", "is", "beautifull", "umbrella" };

		for (int i = 0; i < s.length; i++) {
			for (int j = i + 1; j < s.length; j++) {
				if (s[i].length() < s[j].length()) {
					String temp = s[i];
					s[i] = s[j];
					s[j] = temp;
				}
			}
			System.out.println(s[i]);
		}
	}

	// replace method
	void replace() {
		String s = "java java";

		String temp = s.replace('a', 'g');// replace elemetn/character
		System.out.println(temp);

		String newtemp = s.replace("java", "programming");// replace String
		System.out.println(newtemp);

		String newnewtemp = s.replaceFirst("java", "1st java");// replace only 1st String
		System.out.println(newnewtemp);
	}

	// Contains method
	void contains() {
		String s = "Information technology";
		boolean ans = s.contains("Inform");
		if (ans == true) {
			System.out.println("Available");
		} else
			System.out.println("Not Present");
	}

	// Assignment Palindrome string ; MADAM, MAM, MOM, LOL;;
	void palindromeString() {
		String s = "madam";
		String reverce = "";//second string mdhe reverse values taklya ankhi ek string ghetli 
		char ch[] = s.toCharArray();//string la char mde convert kel
		for (int j = ch.length - 1; j >= 0; j--) {//loop asa lavla ki purn character apn split kele ani ulte milavle ani te ulte char
			reverce = reverce + s.charAt(j);//ethe reverce mdhe ghetle
		}
		if (s.equalsIgnoreCase(reverce)) {// ani mg reverce la original string sobat check kel
			System.out.println("Palindrome");
		} else
			System.out.println("Not Palindrome");
	}

	// Substring ;;; to print from that index upto the req index
	void subString() {
		String s = "the java book";
		String temp = s.substring(5, 9);

		System.out.println(temp);
	}

	// trim method;; remove space of front and back of string
	void Trim() {
		String s = "   the java book   ";
		System.out.println(s.trim());
	}

	// endWith method;;compares end point with input boolean output
	void endWith() {
		String s = "endingpoint";
		System.out.println(s.endsWith("int"));
	}

	//Vowels frequency
	void vowels() {
		String s="awqwxedfgtiotgfduaedfgsikmnkmnou";
		char ch[]=s.toCharArray();
		
		int a=0,e=0,i=0,o=0,u=0;
		
		for(int j=0;j<ch.length;j++) {
			
			if(s.charAt(j)=='a') {
				a++;
			}
			if(s.charAt(j)=='e') {
				e++;
			}
			if(s.charAt(j)=='i') {
				i++;
			}
			if(s.charAt(j)=='o') {
				o++;
			}
			if(s.charAt(j)=='u') {
				u++;
			}
		}
		System.out.println("count of a is : "+a);
		System.out.println("count of e is : "+e);
		System.out.println("count of i is : "+i);
		System.out.println("count of o is : "+o);
		System.out.println("count of u is : "+u);
	}
	
	//reverrce string by using string buffer
	void stringBuffer() {
		String s="stringbuffer";
		StringBuffer sb= new StringBuffer(s);
		sb.reverse();
		System.out.println(sb);
	}
	
	//Anagram ::::listen and silent same element in two diff words
	void Anagram() {
		String s1="listen";
		String s2="silent";
		
		String s3=s1.toLowerCase();							//toLowerCase()	
		String s4=s2.toLowerCase();
		
		if(s3.length()==s4.length()) {
			
			char ch1[]=s3.toCharArray();					//string.toCharArray()
			char ch2[]=s4.toCharArray();
		
			Arrays.sort(ch1);								//arrays.sort()--elements separated
			Arrays.sort(ch2);
			
			if(Arrays.equals(ch1, ch2)) {					//arrays.equals()
				System.out.println("Given string are Anagram");
			} else
				System.out.println("String are not anagram");
		}else
			System.out.println("Length is not equal");
	}
	
	//freq of elements in string
	public void elementCount() {
		String s="abcdefghiabcdefgh";
		String s1=s.toLowerCase();
		char ch[]=s1.toCharArray();
		for(int i=0;i<ch.length;i++) {
			int count=0;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					count++;
					ch[j]=0;
				}
			}
			if(ch[i]!=0) {
				System.out.println(ch[i]+" element count is : "+count);
			}
			
		}
	}
	
	//IMP Anagram
	void anagram1() {
		String s="silent";
		String s1="listen";
		
		char ch[]=s.toCharArray();
		char ch1[]=s1.toCharArray();
		
		int flag=0;
		if(ch.length==ch1.length) {
			for(int i=0;i<ch.length;i++) {
				for(int j=i+1;j<ch.length;j++) {
					if(ch[i]>ch[j]) {
						char temp=ch[i];
						ch[i]=ch[j];
						ch[j]=temp;
					}
				}
			}
			for(int i=0;i<ch.length;i++) {
				System.out.println(ch[i]);
			}
			
			for(int i=0;i<ch1.length;i++) {
				for(int j=i+1;j<ch1.length;j++) {
					if(ch1[i]>ch1[j]) {
						char temp=ch1[i];
						ch1[i]=ch1[j];
						ch1[j]=temp;
					}
				}
			}
			for(int i=0;i<ch1.length;i++) {
				if(ch[i]==ch1[i]) {
					flag=1;
				}
			}if(flag==1) {
				System.out.println("Anagram");
			}
			
		}else
			System.out.println("Not An Anagram");
	}
	
	public static void main(String[] args) {
		MethodInString m = new MethodInString();

		m.lowercase();
		//m.anagram1();
		//m.elementCount();
		//m.Anagram();
		// m.stringBuffer();
		// m.vowels();
		// m.endWith();
		// m.Trim();
		// m.subString();
		// m.palindromeString();
		// m.contains();
		// m.replace();
		// m.Count();
		// m.sequence();
		// m.compareTo();
		// m.concate();
		// m.lowerCase();
		// m.methodCount();
		// m.reverceString();

	}
}
