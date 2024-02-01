package training;

public class AlternatePrime {

	public static void main(String[] args) {
	  //2 3 5 7 11 13 17
	  // 2 5 11 17 
		int a=20,c=0,k=0,p=0;
		  int arr[]=new int[a/2];
		for(int i=2;i<=20;i++)
		{c=0;
		    for(int j=2;j<i;j++)
		    {
		        if(i%j==0)
		        {
		            c++;
		        }
		  
		    }
		    if(c==0)
		    {p=i;
		        arr[k]=i;
		        k++;
		    }
		}
		for(int i=0;i<arr.length;i=i+2)
		{
		    if(arr[i]!=0)
		    {
		        System.out.print(arr[i]+" ");
		    }
		}
	}
}
