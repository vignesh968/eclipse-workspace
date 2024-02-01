package array;
import java.util.*;
public class sprialpattern {

	public static void main(String[] args) {
		int n=4;
		for(int i=1-n;i<n;i++)
		{
			for(int j=1-n;j<n;j++)
			{
			if(Math.abs(i)>Math.abs(j))
			{
				System.out.print(Math.abs(i)+1);
			}
			else
			{
				System.out.print(Math.abs(j)+1);
			}
			}
			System.out.println();
		}
	}

}
