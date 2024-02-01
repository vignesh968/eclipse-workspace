package javanumberbased;

import java.util.*;

public class DigitsumMUL {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a three number");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		int thr=(a/100)%10;
		int sec=(b/10)%10;
		int m=c%10,w=0;
		while(c!=0)
		{
			int t=c%10;
			if(m>t)
			{
				w=t;
			}
			c=c/10;
		}
		System.out.println(thr+w+sec);	
	}
}
