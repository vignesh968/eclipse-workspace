package training;
//not start with 0
public class DuckNumber {
	public static void main(String[] args) {
		   int a=0420;
		   int b=a;
		   String c=""+a;
		   int f=0;
		   int l=c.length()-1;
		   while(b>0)
		   {
		       int t=b%10;
		       if(t==0)
		       {
		           f=1;
		       }
		       b/=10;
		       
		   }
		   if(f==1)
		   {
		       System.out.print("duck Number");
		   }
		   else
		   {
		    
		       System.out.print("not a duck Number");   
		   }
		}
}
