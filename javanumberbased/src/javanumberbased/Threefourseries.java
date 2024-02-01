package javanumberbased;
import java.util.*;
public class Threefourseries
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=3;
	String s="";int r=0;int i=0;
	while(a!=r){
	    int f=0;
	    s=s+i;
	    for(int j=0;j<s.length();j++){
	        char x=s.charAt(j);
	        if(x!='3' && x!='4'){
	            f=1;
	            break;
	        }
	    }
	    if(f==0){
	       r++ ;
	    }
	    s="";
	     ++i;
	}
	System.out.println(i-1);
}
}

