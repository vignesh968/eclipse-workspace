package training;

import java.util.*;

public class Arraycheckfrontback {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		String fr="",backString="";
		int front=0,back=0;
	int min=n/2;
	for(int i=0;i<min;i++)
	{
		front=front*10+arr[i];
		
	}
	for(int i=min;i<arr.length;i++)
	{
		back=back*10+arr[i];
		
	}
	int mesfr=front;
	
	int mesba=back;
	int backrev=0;
	int frontrev=0;
	while(mesba>0&&mesfr>0)
	{
	backrev=backrev*10+mesba%10;
	mesba/=10;
	frontrev=frontrev*10+mesfr%10;
	mesfr/=10;
	
	}
	
	if(front==back||frontrev==backrev |front==backrev||frontrev==back) {
	System.out.println("true");
	}
	else {
		System.out.println("false");
	}
	}
}
