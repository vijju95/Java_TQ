package Assignment;

import java.util.Scanner;

public class Milk_Oil_assn {

	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		System.out.println("Enter milk Qty : ");
		int milk = s.nextInt();
		
		Scanner c = new Scanner (System.in);
		System.out.println("Enter oil Qty : ");
		int oil = c.nextInt();
		
		int sum=0;
		int milkP=40;
		int oilP=50;
		
		sum = (milk*milkP) + (oil*oilP) ;
		while(true) {
			if(sum>=500) {
				break;
			}
		}	
		System.out.println(sum);
		
		while(sum<500) {
			System.out.println(milk +" "+ oil);
		}
	s.close();
	c.close();
	}
}
