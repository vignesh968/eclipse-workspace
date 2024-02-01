package array;

import java.util.Scanner;

public class xpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int p=a*2-1;
		int d=1;
	    for(int i=1;i<=p;i++){
	        
              for(int j=1;j<=p;j++){
              
           if(i==j || i+j==2*a){  
          System.out.print(d+" ");
		      }
           else
           {
        	   System.out.print("  ");
           }
		
          }
              if(i<a)
              {
            	  d++;
              }
              else {
				d--;
			}
              System.out.println();
        }
	}

}
