package Hello;
import java.util.*;
public class contain {

	
		public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int count=0;
	    int num=sc.nextInt();
	    int []arr=new int[num];
	    int i;
	    for(i=0;i<num;i++)
	    {
	        arr[i]=sc.nextInt();
	    }
	    for(i=0;i<num;i++)
	    {
	    if(arr[i]>=3)
	    {
	    	break;
	    }
	    else
	    {
	    	count=count+(3-arr[i]);
	    }
	    
	    }
	    System.out.println(count);
		}
	}


