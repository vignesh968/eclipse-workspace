package javanumberbased;
import java.util.*;
public class numberstr {
public static void main(String[]arg)
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	String on[]= {"","one ","two ","three ","four ","five ","six ","seven ","eight ","nine "};
	String h[]= {"","onehundred ","twohundred ","threehundred ","fourhundred ","fivehundred ","sixhundred ","sevenhundred ","eight hundred ","ninehundred "};
	String ten[]= {"","ten ","twenty ","thirty ","forty ","fifty ","sixty ","seventy ","eighty ","ninety "};
	int a=n%10;
	int b=(n%100)/10;
	int c=(n%1000)/100;
	
	for(int i=0;i<h.length;i++)
	{
		if(i==c)
		{
			System.out.print(h[i]);
			break;
		}
	}
	for(int i=0;i<ten.length;i++)
	{
		if(i==1)
		{
			System.out.print(on[i]);
			break;
		}
		else
		{
			System.out.print(ten[i]);
			break;
		}
	}
	for(int i=0;i<on.length;i++)
	{
		if(i==a)
		{
			System.out.print(on[i]);
		break;}
	}
}
}