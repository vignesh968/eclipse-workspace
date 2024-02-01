

package strings;
import java.util.*;
public class Main {
public static void main(String[]args)
{
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	int arr[]=new int[a];
	int c=0,sum=0;
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=s.nextInt();
		c++;
	}
	if(c==a)
	{
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		
	System.out.println(sum);
	}
else
	{
	System.out.println("wrong input");
	}
}
}