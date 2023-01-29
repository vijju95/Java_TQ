package StringAssignment;

public class StringAssignments {

	// Write a Java program to find last occurrence of a character in a given string
		void firstOccurance(){ //returns index of element in string
			String s="Weicome";		
				System.out.println(s.indexOf('W'));
		}
		
	//code to find first occurence of element
	void occurance() {
		String s="occurance";
		char ch[]=s.toCharArray();
		char temp=0;
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]>ch[j]) {
					temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
			System.out.println(ch[i]);
		}
	}
	
	//code to write occurance of char in string
	public void Count() {
		String s="ClassmateBook";
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
			if(ch[i]!=0 && count!=0) {
			System.out.println(ch[i]+" count is : "+count);
			}
		}
	}

	//Write a Java program to count total number of vowels and consonants in a string.
	void vowels() {
		String str="aeiounhfgau";
		String s=str.toLowerCase();
		char ch[]=s.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
				System.out.println(ch[i]);
				count++;
			}
		}
		System.out.println("total count of vowel  is : "+ count);
	}
	
	// Write a Java program to find reverse of a string
	void reverse() {
		String s="Good";
		char ch[]=s.toCharArray();
		String reverce="";
		for(int i=ch.length-1;i>=0;i--) {
			reverce=reverce+ch[i];
		}
		System.out.println(reverce);
	}
	
	// Write a Java program to find last occurrence of a character in a given string
	void lastOccurance(){
		String s="Weicome";		
			System.out.println(s.lastIndexOf('e'));
	}

	public static void main(String[] args) {
		StringAssignments s=new StringAssignments();
		
		//s.firstOccurance();
		//s.lastOccurance();
		//s.reverse();
		//s.vowels();
		//s.occurance();
		s.Count();
		
	}
	
}