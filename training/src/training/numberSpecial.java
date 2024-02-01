package training;

import java.util.Scanner;

public class numberSpecial {
	public static void main(String []args) {
	String a="1234*+-";
	String b="";
	String c="";
	for(int i=0;i<a.length();i++)
	{
		if(a.charAt(i)>='0'&&a.charAt(i)<='9')
		{
			b+=a.charAt(i);
		}
		else {
			c+=a.charAt(i);
		}
	}
	int sum=b.charAt(0)-'0';
	int u=0;
	for(int i=1;i<b.length();i++)
	{
		for(int j=0;j<c.length();j++)
		{
			u=b.charAt(i);
			if(c.charAt(j)=='*')
			{
				sum=sum*u;
			}
			else if(c.charAt(j)=='+')
			{
				sum =sum+u;
			}
			else if(c.charAt(j)=='-')
			{
				sum=sum-u;
			}
		}
	
	}
	System.out.println(sum);
	}
}
