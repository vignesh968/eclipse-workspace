package javanumberbased;
import java.util.*;
public class reverse {
public static void main(String[]args)
{
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	int t=a;
	int r=0,sum=0;
	while(a!=0)
	{
		r=a%10;
		if(r!=0)
		{
			sum=sum*10+r;
		}
		a=a/10;
	}
	if(t>0)
	{
	System.out.print(sum);	
	}
	else
	{
		System.out.print(sum);
	}
}
}
