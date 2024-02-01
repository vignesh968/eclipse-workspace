package array;
import java.util.*;
public class Patternusingwhileloop {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int i=1;
		while(i<num)
		{int j=1;
			while(j<num)
			{
				System.out.print(j);
			j++;
			}
			System.out.println();
			i++;
		}
	}

}
