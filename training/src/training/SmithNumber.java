package training;

public class SmithNumber {
	static public int primefact(int p)
    { int f=1,c=0;
        int sum=0;
        for(int i=2;i<85;i++)
        {
            if(85%i==0)
            {
                for(int j=2;j<i;j++)
                {
                    if(i%j==0)
                    {
                  c++;      
                    }
                }
                if(c==0)
                {
                  int k=i;
                    while(k>0)
                    {
                        int t=k%10;
                        sum+=t;
                        k/=10;
                    }
                }
            }
        }
        return sum;
    }
    static public int select(int n)
{
    int sum=0;
    while(n>0)
    {
        int t=n%10;
        sum+=t;
        n/=10;
    }
    return sum;
}
    
	public static void main(String[] args) {
	   int number=85;
	 int t=0;
	  
	   int rs=primefact(number);
	  
	 
	   int res=select(number);
	    if(res==rs)
	    {
	        System.out.print("smith number.");
	    }
	    else
	    {
	        System.out.print("not  smith number.");
	    }
        //System.out.print(binaryNumber);
	}

}
