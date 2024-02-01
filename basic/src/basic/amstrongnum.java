package basic;
import java.util.*;
public class amstrongnum {
public static void main(String[]args)

{
	Scanner sc=new Scanner(System.in);
    System.out.println("enter Number");
   int a=sc.nextInt();
   int b,sum=0,temp=a;
   while(a!=0)
	{
		b=a%10;
		sum+=b*b*b;
		a=a/10;
	}
   if(temp==sum)
   {
	   System.out.println("Amstrong number");  
   }
   else
   {
	   System.out.println("not Amstrong number");  
   }
}
}
