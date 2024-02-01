package training;

public class Twoprimeadd {

	public static void main(String[] args) {
	
		//input from user
	//	System.out.print("Enter a number : ");				
		int number =34 ;
		int x = 0;
		for(int i = 2 ; i <= number/2 ; i++)
		{
			if(prime_or_not(i) == 1)
			{
				if(prime_or_not(number-i) == 1)
				{
					System.out.println(number+ " = "+i+" + "+(number-i));
					x = 1;
				}
			}
		}
		if(x == 0)
			System.out.println(+number+" cannot be expressed as a sum of two prime numbers");
	}
        //function for checking number is prime or not
	public static int prime_or_not(int n)
	{
		int c = 1;
		for(int i = 2 ; i < n ; i++)
		{
			if(n % i == 0)
			{
				c = 0;
				break;
			}
		}
		return c;
	}
}
