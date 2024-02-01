package array;
import java.util.*;
public class pattern {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=a;int x=1;
	for(int i=1;i<=a;i++){
	    for(int j=0;j<=a-i;j++){
	        System.out.print(x+" ");
	        x=x+b;
	        b--;
	    }System.out.println();
	    b=a;
	    x=i+1;
	}
	}
}
