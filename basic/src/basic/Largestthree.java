package basic;

import java.util.Scanner;

public class Largestthree {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter a three numbers");

		int num1=s.nextInt();
		int num2=s.nextInt();
		int num3=s.nextInt();
	if(num1>num2&&num1>num3)
	{
		System.out.print(num1);
	}
	else if(num2>num1&&num2>num3)
	{
		System.out.print(num2);
	}
	else
	{
		System.out.print(num3);

	}
	
	}

}
