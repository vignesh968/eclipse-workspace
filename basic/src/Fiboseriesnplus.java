import java.util.*;
public class Fiboseriesnplus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int a=1;int b=1;int c;
        for(int i=1;i<=x;i++) {
             c=a+b;
             a=b;
             b=c;} 
        
        System.out.println(a);
   }

/*
 1 2 3 4
 2	   3
 3	   2
 4 3 2 1
 */ 	
 
	
}
