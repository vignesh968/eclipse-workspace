package training;

public class Patten2 {

	public static void main(String[] args) {
	int a=5;
	int ss=1;
	for(int i=1;i<=a;i++)
	{
		for(int j=a-i+1;j>=1;j--)
		{
			System.out.print(j+" ");
		}
		System.out.println();
	}
	System.out.println("------------------------");
	
	for(int i=1;i<=a;i++)
	{
		for(int j=ss;j>=1;j--)
		{
			System.out.print(j+" ");
		}
		ss++;
		System.out.println();
	}
	int p=a;
	System.out.println("------------------------");
	for(int i=1;i<=a;i++)
	{
		for(int j=p;j>=i;j--)
		{
			System.out.print(j+" ");
		}
		
		System.out.println();
	}
	
	System.out.println("------------------------");
	for(int i=1;i<=a;i++)
	{
		for(int j=p;j>=p-i+1;j--)
		{
			System.out.print(j+" ");
		}
		
		System.out.println();
	}
	System.out.println("---------------------");
	int b=a;
	for(int i=1;i<=a;i++)
	{
		for(int j=1;j<=b;j++)
		{
			System.out.print(j+" ");
		}
		b--;
		System.out.println();
	}
	System.out.println("---------------------");
	int num=1;
	for(int i=1;i<=a;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(num+" ");
			num++;	}
		
			System.out.println();
	}
	
	System.out.println("---------------------");

	for(int i=1;i<=a;i++)
	{
		int t=i;
		for(int j=1;j<=i;j++)
		{
			System.out.print(t+" ");
			t=t+a;
				}
		
		
		System.out.println();
	}
	
	}

}
