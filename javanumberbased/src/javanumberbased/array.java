package javanumberbased;
import java.util.*;

public class array
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int c=0;int n=0,d=0;
		int arr[]=new int[a];
		for(int i=0;i<a;i++){
		    arr[i]=sc.nextInt();
		    
		    }
		for(int i=0;i<a;i++){
			if(arr[i]!=0){
		        d=arr[i];
		        c++;
		        break;
		    }
		
		    
	   
		    Arrays.sort(arr);
		    
		    for(int j=0;j<arr.length;j++){
		        if(j==0){
		            arr[j]=d;
		            System.out.print(arr[j]+" ");
		            
		        }
		        else{
		        	
		            System.out.print(arr[j]+" ");
		        }
	    }
		
	}// System.out.println(d);
	}
}

