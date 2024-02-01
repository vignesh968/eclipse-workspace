import java.util.*;
public class lengthofarray {
	public static void main(String[]vicky)
	{
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println(arr.length);

	}
}
