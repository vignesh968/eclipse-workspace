package array;

public class DownwardTriangle {
	

public static void main(String[] args) {
    int rows=6;
for (int i= rows-1; i>=0 ; i--)  
{  
//outer loop  
for (int j=0; j<=i; j++)  
{  

System.out.print("*" + " ");  
}  

System.out.println();  
}  
}
}