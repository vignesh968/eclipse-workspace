package training;

import java.util.Scanner;

public class subarray {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		int k=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		for(int i=m;i<k;i++)
		{
			System.out.print(arr[i]);
		
		}

	}

}
