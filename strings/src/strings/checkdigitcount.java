package strings;

import java.util.*;

public class checkdigitcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner (System.in);
   String a=sc.nextLine();
   char s[]=a.toCharArray();
   char ch;
   int t=0;
Set<Character>io=new HashSet<Character>();
   for(char c:s)
   {
	  
	 
		io.add(c);  
	  
   }
   System.out.print(io); 
   

	}

}

