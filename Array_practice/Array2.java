package Array_practice;

import java.util.Scanner;

public class Array2 {

	// MULTIPLICATION OF ALL ELEMENT IN ARRAY
	void multiplication() {
		int arr[] = { 2, 6, 4 };
		int num = 1;
		for (int i = 0; i < arr.length; i++) {
			num = num * arr[i];
		}
		System.out.println("number multiplication is :" + num);
	}

	// PRINTING EVEN VALUES ONLY
	void evenValues() {
		int arr[] = { 5, 6, 2, 3, 4 };

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println(arr[i]);
			}
		}
	}

	// PRINTING ZERO AT THE END
	void zeroAtEnd() {
		int arr[] = { 5, 6, 0, 8, 4, 0, 6, 0, 8 };

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				System.out.println(arr[i]);
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				System.out.println(arr[i]);
			}
		}
	}

	// COMPARING 1STRING ELEMENT WITH MULTIPLE
	void compareFirsttoMultiple() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int size = sc.nextInt();

		System.out.println("Enter the strings : ");
		String str[] = new String[size];

		for (int i = 0; i < str.length; i++) {
			str[i] = sc.next();
		}
		System.out.println("Enter the object : ");
		String object = sc.next();
		for (int i = 0; i < str.length; i++) {
			if (str[i].equals(object)) {
				System.out.println("Present");
			}
		}
	}

	// PRINTING ARRAY REVERSE ORDER
	void reverce() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		String s = sc.next();
		char ch[] = s.toCharArray();

		for (int i = ch.length - 1; i >= 0; i--) {
			System.out.println(ch[i]);
		}
	}

	// Merge two array
	static void merge() {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		int[] arr1 = new int[arr.length];

		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			arr1[j] = arr[i];
			j++;
		}

		for (int i = arr.length - 1; i >= 1; i--) {
			arr1[j] = arr[i];
			j++;
		}

		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
	}

	public static void main(String[] args) {
		Array2 a = new Array2();
		a.compareFirsttoMultiple();
		a.evenValues();
		a.multiplication();
		a.reverce();
		a.zeroAtEnd();
		Array2.merge();
	}
}
