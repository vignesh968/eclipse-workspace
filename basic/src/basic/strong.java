package basic;

import java.util.Scanner;

public class strong {
	public static void main(String[]args)

{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Number");
		int a=sc.nextInt();
		int b,f,sum=0,temp=a;
		while(a!=0)
		{
	    b=a%10;
	    f=1;
	    	for(int i=1;i<=b;i++)
	    	{
	    		f=f*i;
	   
	    	}
	    sum=sum+f;
	    a=a/10;
}
   System.out.println("sum of factorial of digit:"+sum);

	if(temp==sum) {
		System.out.println("Strong Number");
	}else {
		System.out.println("Not a Strong NUmber");
	}
}
}