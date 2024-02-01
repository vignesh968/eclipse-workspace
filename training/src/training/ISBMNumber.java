package training;

public class ISBMNumber {
	public static void main(String[] args) {
	    int number= 1259060977;
	    int n=number;
	    int sum=0;
	    int h=10;
	    while(n>0)
	    {
	        int t=n%10;
	        sum+=h*t;
	        h--;
	        n/=10;
	    }
	    if(sum%11==0)
	    {
	        System.out.print("isbn number");
	    }
	    else
	    {
	        System.out.print("not isbn number");
	    }
        //System.out.print(binaryNumber);
	}
}
