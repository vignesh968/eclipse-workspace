package basic;
import java.util.*;
public class revdigit {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int a,b,num=0,sum=0;
		a=sc.nextInt();
		while(a!=0)
		{
			b=a%10;
			num=num*10+b;
			sum=sum+b;
			a=a/10;	
		}
		System.out.println("reverse num="+num);
		System.out.println("sum="+sum);
	}
}