package array;

public class Basicarray {

	public static void main(String[] args) {
		
		int a=5;
		int t=0;
		int arr[]= {3,1,2,98,34};
		for(int i=0;i<a;i++)
		{
			for(int j=i+1;j<a;j++)
			{
				if(arr[j]<arr[i])
				{
				t=arr[i];
				arr[i]=arr[j];
				arr[j]=t;
				}
			}}
			for(int i=0;i<a;i++)
			{
				System.out.print(arr[i]+" ");
			}
			
		
	}

}
