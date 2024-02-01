package training;
import java.util.*;
public class secondelement {
public static void main(String []args) {
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	int arr[]=new int[a];
	for(int i=0;i<a;i++)
	{
		arr[i]=s.nextInt();
	}
	int m=Integer.MAX_VALUE;
for(int i=0;i<a;i++)
{
	for(int j=i+1;j<a;j++)
	{
		if(arr[j]>arr[i])
		{
			if(arr[j]>m)
			{
				m=arr[j] ;
			}
		}
	}
}
}
}
