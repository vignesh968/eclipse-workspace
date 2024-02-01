package basic;

import java.util.Scanner;

public class Divisor {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the dividend value");
		int dividend=s.nextInt();
		System.out.println("enter the divisor value");
		int divisor=s.nextInt();
		int q,r;
		q=dividend/divisor;
		r=dividend%divisor;
		System.out.println("QUOTIENT: "+q);
		System.out.println("Remainder: "+r);
		}
}
