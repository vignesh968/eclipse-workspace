package array;

import java.util.*;

public class Postivenumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a two number");
		int num1=s.nextInt();
		int num2=s.nextInt();
		if(num1>0&&num2>0)
		{
			System.out.println("both are positive number");
		}
		else if(num1>0){System.out.println("num1 positive number");
		}
		else if(num2>0)
		{
			System.out.println("num2 positive number");
		}
		else
		{
			System.out.println("both are not positive number");
		}


	}
}
