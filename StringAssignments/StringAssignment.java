package StringAssignments;

public class StringAssignment {

	// Average of digit in string
	void average() {
	
		String s="ad8f4h414hwj";
		char[] a=s.toCharArray();
		int sum=0;
		float avg;
		int count=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+i;
			count++;
		}
		avg=sum/count;
		System.out.println(avg);
	}
	
	// Create Strings with new operator and without new
	void CreationNew() {
		String s=new String("NEWKEYWORD");
		String s1=new String("NEWKEYWORD");
		if(s==s1) {
			System.out.println("equals...");
		}else
			System.out.println("not equals...");
	}
	void CreationLiteral() {
		String s="LITERAL";
		String s1="LITERAL";
		if(s==s1) {
			System.out.println("equals...");
		}else
			System.out.println("not equals...");
	}
	
	//Write a code to prove that strings are immutable in java
	void immutable() {
		String s="dell";
		s.concat("sony");
		System.out.println(s);// sis still pointing to "dell"
	}
	
	// Write a program to find the number of vowels, consonants
	void count() {
		String s="example of count";

		char ch[]=s.toCharArray();
		int vowels=0,consonant=0;
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
				vowels++;
			}else
				consonant++;
		}
	System.out.println("Vowels: " + vowels);
    System.out.println("Consonant: " + consonant);
	}
	
	// Write a program to find the number of digits and spl char
	void countnew() {
		String s="f7ind742900co45u8nt";
		char ch[]=s.toCharArray();
		int digit=0,specialChar=0;
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>=0 && ch[i]<=9) {
				digit++;
			}else
				specialChar++;
		}
	    System.out.println("Digit: " + digit);
	    System.out.println("Special Character: " + specialChar);
	}
	
	// Write a Java program to find second occurrence of a character in a given string
	void occurance() {
		String s="java";
		System.out.println(s.indexOf('v'));
	}
	
	//. Write a Java program to count occurrences of a word in a given string
	void wordCount() {
		String s="this is java programmin";
		String s1="is";//to find the count of is string from available string
		
		String s2[]=s.split(" ");
		int count=0;
		for(int i=0;i<s2.length;i++) {
			if(s1.equals(s2[i])) 
				count++;
		}
		System.out.println(count);
	}
	
	//write a Java program to convert uppercase string to lowercase
	void upperTolower() {
		String s="PrInTsCrEeN";
		//System.out.println(s.toLowerCase());
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>'A' && ch[i]<'Z') {
				ch[i]=(char)((int)ch[i]+32);
			}
		}
		for(int i=0;i<ch.length;i++) {
			System.out.println(ch[i]);
		}
	}
	
	//Write a Java program to trim leading white space characters in a string
	void space() {
		String s="       java is a programming language       ";
		System.out.println(s.trim());
	}
	
	// Write a Java program to remove first occurrence of a word from string
	void remove() {
		String s="removefirst";
		char ch='r';

			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == ch) {
					s = s.substring(0, i) +
						s.substring(i + 1);
					break;
				}
			}
		System.out.println(s);
	}
	
	//program to print 1st char from string
	void first() {
		String s="firstchar";
		char ch[]=s.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			System.out.println(ch[i]);
			break;
		}
	}

	//Write a Java program to find reverse of a string
	void reverce() {
		String s="reverce";
		char ch[]=s.toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
			System.out.println(ch[i]);
		}
	}
	
	//Write a Java program to replace first occurrence of a character with another in a string
	void replace() {
		String s="string";		
		System.out.println(s.replace('s', 'r'));
	}
	
	//Write a program to find out the largest and smallest length word in the string “This is an umbrella"
	void larSmall() {
		String s[]={"This","is","an","umbrella"};
		for(int i=0;i<s.length;i++) {
			String temp=null;
			for(int j=i+1;j<s.length;j++) {
				if(s[i].length()<s[j].length()) {
					temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
			
		}
		//String [] s1=s.split(" ");
		String first=s[0];
		String last=s[s.length-1];
		System.out.println("Largest length word is : "+first+"\n"+"Small word is : "+last);
	}
	
	//Write a program to find out the largest and smallest length word in the string “This is an umbrella"
		void larSmall1() {
			
			String s="hello java this is small large program";
			String arr[]=s.split(" ");
			for(int i=0;i<arr.length;i++) {
				String temp=null;
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i].length()<arr[j].length()) {
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
			String ss=arr[arr.length-1];
			String sss=arr[0];
			System.out.println("Smaill : "+ss+"  "+"large : "+sss);	
		}
			
	
	//Write a function to find the substring between “is” and “of”
	void subString() {
		String s="java is language of programming";
		String p=s.substring(5);
		String q=s.substring(5, 16);
		System.out.println(q);
	}
	
	//Find out the number of occurrence of all alphabets in that string
	void alphabets() {
		String s="alphabets";
		char ch [] =s.toCharArray();
		char c='a';
		int count=0;
		for(int i=0;i<ch.length;i++) {
			if(ch[i]==c) {
				count++;
			}
		}
		System.out.println(count);
	}
	
	//Palindrome
	void palindrome() {
		String s="mom";
		String reverce="";
		
		char ch []=s.toCharArray();
		
		for(int i=ch.length-1;i>=0;i--) {
			reverce=reverce+ch[i];
		}if(reverce.equalsIgnoreCase(s)) {
			System.out.println("Giving string is pelindrome");
		}else
			System.out.println("Giving string is not pelindrome");
	}
	
	public static void main(String[] args) {
		StringAssignment c=new StringAssignment();
		
		c.average();
		//c.larSmall();
		//c.palindrome();
		//c.alphabets();
		//c.subString();
		//c.larSmall1();
		//c.replace();
		//c.reverce();
		//c.remove();
		//c.first();
		//c.space();
		//c.upperTolower();
		//c.wordCount();
		//c.occurance();
		//c.countnew();
		//c.count();
		//c.immutable();
		//c.CreationLiteral();
		//c.CreationNew();
		
	}
}
