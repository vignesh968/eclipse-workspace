package training;

public class EvilNumber {

	public static void main(String[] args) {
		int n=18;
		int m=n;
		int j=1,res=0;
		while (m>0) {
			int t=m%2;
			res+=t*j;
		
			m/=2;
			j=j*10;
		}
		System.out.println(res);
		int c=0;
		while (res>0) {
			if(res%10==1)
			{
				c++;
			}
			res/=10;
		}
		if(c%2==0)
		{
			System.out.println("EvilNumber");
		}
		else {
			System.out.println("not a Evil number");
		}
		
	}

}
