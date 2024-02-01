package practice;
import java.util.*;
public class revnumeven {

	
	  public static void main(String[]args)
	  {
	    Scanner sc=new Scanner(System.in);
	     System.out.println("enter Number");
	    int a=sc.nextInt();
	   
	   for(int i=a;i>0;i--)
	   {
	       if(i%2==0)
	       {
	           System.out.print(i+" ");
	       }
	   }
	 }
}


