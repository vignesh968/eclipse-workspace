package array;
import java.lang.*;
import java.util.*;
public class Squarepattern {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=n;j++)
			{
				System.out.print("*");;
			}
			System.out.println();
		}
		System.out.println();
		
}

}