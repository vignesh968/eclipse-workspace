package training;

public class Recursionsumofnat {
	public static void main(String[]args)
	{
		int n=20;
		 System.out.println(natural(n));
	}
	public static int natural(int n)
	
	{
		if(n!=0)
		{
			return n+natural(n-1);
					}
		else {
			{
				return n;			}
		}
	}
}
