package collections;
import java.util.*;
public class Main
{
    public static int isdig(int i)
	{
	    while(i>0)
	    {
	        if((i%10)==5)
	        {
	            return 1;
	        }
	    }
	    return 0;
	}
	public static void main(String[] args) {
	int a =100;
	int b=200;
	ArrayList<Integer>r=new ArrayList<Integer>();
	for(int i=a;i<b;i++)
	{
	    if(isdig(i)==1)
	    {
	        r.add(i);
	    }
	}
	   
	        System.out.print(r);
	  
	
	}
	
}
