package array;

import java.util.Scanner;

public class Triangularpattern3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int num=s.nextInt();
		int i=1;
		
		while(i<=num)
		{int j=1;
		int p=i;
			while(j<=i)
			{
				System.out.print(p);
			j++;
			p++;
			}
			System.out.println();
			i++;
		}


	}

}
