package training;

public class fivepattern {
public static void main(String []args) {
	int a=4;
	int res1=0;
	int arr[]= {1,999,342,456,45};//4 344 213 101 10
	for(int i=0;i<arr.length;i++)
	{res1=0;
		while(arr[i]>0)
		{
			int t=arr[i]%10;
			res1=res1*10+Math.abs(t-5);
			arr[i]/=10;
		}
		arr[i]=res1;
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	int res2=0;
	for(int i=0;i<arr.length;i++)
	{res2=0;
		while(arr[i]>0)
		{
			int t=arr[i]%10;
			res2=res2*10+t;
			arr[i]/=10;
		}
		arr[i]=res2;
		System.out.print(arr[i]+" ");
	}
System.out.println();
	int sum=0;
	int t=0;
		for(int i=0;i<arr.length;i++)
	{sum=0;
		while(arr[i]>0||sum>9)
		{
		    if(arr[i]==0)
		    {
		        arr[i]=sum;sum=0;
		    }
		sum+=arr[i]%10;
			
			arr[i]/=10;
			//if(sum)
		}
		arr[i]=sum;
		System.out.print(arr[i]+" ");
		t+=sum;
	}
		System.out.println();
	System.out.println(t);
}
}