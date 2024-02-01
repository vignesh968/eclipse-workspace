import java.util.*;
public class reverseinteger {
public static void main(String[]args)
{
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int sum=0;
	int temp=a;
	while(a!=0)//128
	{
		int b=a%10;//8
		sum=(sum*10)+b;//s=2*10+3=23*10+8
		a/=10;
	}
	if(sum==temp)
	{
	System.out.println("palindrome");
}
	else {
		System.out.println(" not palindrome");
	}
}
}
