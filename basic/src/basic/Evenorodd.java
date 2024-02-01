package basic;

import java.util.*;

public class Evenorodd {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter a number ");

		int num=s.nextInt();
		if(num%2==0)
			System.out.println("even number");
		else
			System.out.println("odd number");
	}

}
