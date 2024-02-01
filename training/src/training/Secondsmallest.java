package training;
import java.util.*;
public class Secondsmallest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner=new Scanner(System.in);
int a=scanner.nextInt();
int b=scanner.nextInt();
int arr[]=new int[a];
int t=a-b;
for(int i=0;i<a;i++)
{
	arr[i]=scanner.nextInt();
}
for(int i=0;i<a;i++)
{
	for(int j=i+1;j<a;j++)
	{
		if(arr[j]<arr[i]&&t>0)
		{
			
		}
	}
}
	}
}
