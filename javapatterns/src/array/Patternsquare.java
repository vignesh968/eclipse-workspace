package array;
import java.util.*;
public class Patternsquare{
	public static void main(String[] args) {       
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int c=1;
		int d;
	    for(int i=1;i<=a;i++){
	        if(i%2==1){
              for(int j=1;j<=a;j++){
              System.out.print(c+" ");
              c++;
              }
            c=c+a;
            System.out.println();
	       }
           if(i%2==0){  
           d=a*i;
		      for(int j=1;j<=a;j++){
		      System.out.print(d+" ");
		      d--;
		      }
		  System.out.println();
          }
        }
    }
}
/*
 1 2 3 
 6 5 4
 7 8 9
 */
