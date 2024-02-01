package array;

public class Numberpattern2 {

	public static void main(String[] args) {
		int a=5;
		
		int val;
		for(int i=0;i<a;i++)
		{
			
				if((i+1)%2==0)
				{
					val=2;
				}
				else
				{
					val=1;
				}
				for(int j=0;j<=i;j++)
				{
					System.out.print(val+" ");
					val=val+2;
				}
				System.out.println();
			}
			
		}

	}


