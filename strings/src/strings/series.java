package strings;
import java.util.*;
public class series
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=15;
		/*int len=(""+a).length();
		int r=(int)Math.pow(10,len);
		int b=a*a;
		if(b%r==a)
		{
		    System.out.println("correct");
		}
		else{
		    System.out.println("no");
		}*/
		int i=0;int j=1;String s="";
		for(int z=0;z<=100;z++) {
			s=s+z;
			for(int v=0;v<s.length();v++) {
				char x=s.charAt(v);
				if(x=='3' && x=='4') {
					System.out.print(" "+s);	
				}
			}
			//System.out.print(" "+s);
			s="";}
		  
}
}