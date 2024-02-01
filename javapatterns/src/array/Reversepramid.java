package array;

public class Reversepramid {
	public static void main(String[] args) {
	    int rows=6;
	    int s=1;
for (int i= 1; i<=rows ; i++)  
{  
//outer loop  

 for (int j=0; j<=s; j++)  
{  
  
System.out.print(" ");  
}  
s++;
for (int j=0; j<=rows-i; j++)  
{  
  
System.out.print("* ");  
}   
System.out.println();  
}  
	}
}
