package training;
import java.util.*;
public class SphenicNumber {

	public static void main(String[] args) {
		//System.out.println("Hello World");
	int n=301;
	int p=1;
	int b=0;
	ArrayList<Integer>l=new ArrayList<Integer>();
	int c=0;
	for(int i=2;i<=n;i++)
	{
	    if(n%i==0)
	l.add(i);
	}
	    System.out.println("list"+l);
	
	int arr[]=new int[3];
	for(int k:l)
	{c=0;
	    for(int h=2;h<k;h++)
	    {
	        if(k%h==0)
	        {
	        c++;    
	        }
	    }
	    if(c==0 &&b!=3)
	    {
	     
	        p=p*k;
	      
	        b++;
	        
	    }
	}

	System.out.print((p==n&&b==3)?"sphenic number":"not a sphenic number.");
}
}
