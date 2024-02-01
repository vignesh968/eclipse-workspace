
public class Fibonacciserices {

	public static void main(String[] args) {
		int a=14;
		int f=0,s=1;
		int sum=0, res=0;
for(int i=0;i<=a;i++)
{
	
	if(1>=i)
	{
		res=i;
	}
	else {
		 sum=f+s;
		 f=s;
		 s=sum;
		 res=sum;
	}
	System.out.print(res+" ");
}
	}

}
