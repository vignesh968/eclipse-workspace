package training;

public class gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=12;
	    int b=8;
	    int gcd=0;
	    int i;
	    for(i=1;i<=a&&i<=b;i++)
	    {
	        if(a%i==0&&b%i==0)
	        {
	         gcd=i;   
	        }
	    }
	    System.out.print(gcd);
	}

}
