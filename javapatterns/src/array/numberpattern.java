package array;
import java.util.*;
public class numberpattern {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int s=a;
int c=1;
int r=1;
for(int i=0;i<a;i++)
{
	r++;
	for(int j=0;j<s;j++)
	{
		System.out.print(c+" ");
		c++;
	}
	s--;
	System.out.println();
}
	}

}
