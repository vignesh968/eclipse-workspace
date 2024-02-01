package basic;

import java.util.Scanner;

public class Swapnumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter a number 1");

		int num1=s.nextInt();
		System.out.print("enter a number 2");
		int num2=s.nextInt();
		num1=num1-num2;
		num2=num1+num2;
		num1=num2-num1;
		System.out.println("num1="+num1+'\n'+"num2"+num2);
	}
}
