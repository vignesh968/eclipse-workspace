package training;

import java.util.*;

public class Maxidiff {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[j]<arr[i])
				{
					int t=arr[i];
					arr[i]=arr[j];
					arr[j]=t;
				}
		}
				
		}
		int min=arr[0];
		int max=arr[n-1];
		int smin=arr[1];
		int maxdiff=max-min;
		int mindiff=smin-min;
		System.out.println("maximum difference ="+maxdiff);
		System.out.println("minimum difference ="+mindiff);
	}
}
