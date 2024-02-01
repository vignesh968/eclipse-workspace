package training;
import java.util.*;
public class Twodiffarray {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
	{
		arr[i]=s.nextInt();
	}
	int m=n/2;
	int p=n-m;
	int arr1[]=new int[m];
	int arr2[]=new int[p];
	int a1=0,a2=0;
	for(int i=0;i<m;i++)
	{
		arr1[a1]=arr[i];
		a1++;
	}
	for(int i=0;i<arr1.length;i++)
	{
		System.out.print(arr1[i]+" ");
	}
	System.out.println();
	for(int i=p;i<arr.length;i++)
	{
		arr2[a2]=arr[i];
		a2++;
	}
	for(int i=0;i<arr2.length;i++)
	{
	System.out.print(arr2[i]+" ");
	}
		
	}
}
