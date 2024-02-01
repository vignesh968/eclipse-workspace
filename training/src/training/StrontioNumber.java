package training;

public class StrontioNumber {
	public static void main(String[] args) {
		int a=1271;
		int m=(a*2%1000)/10;
		if(m/10==m%10)
		{
		    System.out.print("yes");
		}
		else
		{
		    System.out.print("no");
		}
		
	}
}
