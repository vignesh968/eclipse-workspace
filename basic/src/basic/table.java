package basic;
import java.util.*;
public class table {
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		for(int i=1;i<=20;i++)
		{
		    System.out.printf("%d * %d = %d \n", num, i, num * i);		
		}

}
}