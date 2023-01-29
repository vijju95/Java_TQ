package Assignment;

import java.util.Scanner;

public class Spelling_Rainbow {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first letter : ");
		char a = sc.next().charAt(0);
		Scanner sb = new Scanner(System.in);
		System.out.println("Enter the first letter : ");
		char b = sb.next().charAt(0);
		Scanner se = new Scanner(System.in);
		System.out.println("Enter the first letter : ");
		char c = se.next().charAt(0);
		Scanner sf = new Scanner(System.in);
		System.out.println("Enter the first letter : ");
		char d = sf.next().charAt(0);
		Scanner sg = new Scanner(System.in);
		System.out.println("Enter the first letter : ");
		char e = sg.next().charAt(0);
		Scanner sh = new Scanner(System.in);
		System.out.println("Enter the first letter : ");
		char f = sh.next().charAt(0);
		Scanner si = new Scanner(System.in);
		System.out.println("Enter the first letter : ");
		char g = si.next().charAt(0);
		
		if(a=='R' && b=='A' && c=='I' && d=='N' && e=='B' && f=='O' && g=='W')
		{
			System.out.println("RAINBOW");
		}else
			System.out.println("The spelling is wrong");

	}

}
