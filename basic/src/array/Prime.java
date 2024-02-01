package array;
import java.util.*;
// code optemise
public class Prime {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int num1=s.nextInt();
		int n=2;
//		boolean prime=true;
		while(n<num1/2)
		{
			if(num1%n==0)
			{
				System.out.print("not an prime number");
				return;
//				prime=false;
			}
			n++;
		}
		System.out.print("prime number");
//		if(prime)
//		{
//			System.out.print("prime number");
//		}
//		else
//		{
//			System.out.print("not an prime number");
//		}
	}
}
