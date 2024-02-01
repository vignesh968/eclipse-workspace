package javanumberbased;

import java.util.*;
public class Threedigitfind
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int a[]=new int[n];
		int i,r,max=0;

		for(i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(i=0;i<arr.length;i++)
		{
			while(arr[i]>0)
			{
				r=arr[i]%10;

				if(r>max)
				{
					max=r;
				}
			}
		}
	}
}
