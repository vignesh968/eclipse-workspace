package training;

public class Krishnamurthynumber {
	public static void main(String[] args) {
	    int number= 145;
	    int n=number;
	    int sum=0;
	    int h=10;
	    int f=1;
	    while(n>0)
	    {f=1;
	        int t=n%10;
	       for(int i=1;i<=t;i++)
	       {
	         f=f*i;  
	       }
	       sum+=f;
n/=10;	       
	    }
	    if(sum==number)
	    {
	        System.out.print(" Krishnamurthy number.");
	    }
	    else
	    {
	        System.out.print("not  Krishnamurthy number.");
	    }
        //System.out.print(binaryNumber);
	}
}
