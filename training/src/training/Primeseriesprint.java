package training;

public class Primeseriesprint {

	 public static void main(String[] args) {
		 int a=20;
		 int b=50;
		 int k=0;
		 for(int i=20;i<=50;i++)
		 {
		 if(prime(i)==0)
		 {
		     System.out.print(i+" ");
		 }
		     }
		 }
		 public static int prime(int a)
		 {
		     int t=0;
		     for(int i=2;i<a;i++)
		     {
		         if(a%i==0)
		         {
		           return 1;
		         }
		     }
		     return 0;
		 }

}
