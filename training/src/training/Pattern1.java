package training;

public class Pattern1 {
public static void main(String []args)
{
	int b=5;
	
	
	for(int i=1;i<=b;i++)
	{
		for(int j=b-i+1;j>=1;j--)
		{
		System.out.print(j);
		}
		System.out.println();
	}
	for(int i=2;i<=b;i++)
	{
		for(int j=1;j<=i;j++)
		{
		System.out.print(j);
		}
		System.out.println();
	}
	for(int i=1;i<=b;i++)
	{
		for(int j=1;j<=b-i+1;j++)
		{
		System.out.print(j);
		}
		System.out.println();
	}
}
}