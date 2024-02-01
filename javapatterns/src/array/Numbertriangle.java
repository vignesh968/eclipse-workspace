  package array;

public class Numbertriangle {
	public static void main(String[] args) {
	//	System.out.println("Hello World");
int  k, rows=9; 
int m=0,s=1;
 for (int i=1; i<rows ; i++)  
{
    for(int j=0;j<s-1;j++)
{
    System.out.print(" ");
}
s++;
for( k=i;k<rows;k++)
{
    System.out.print(k+" ");
}
System.out.println();
}
 s=rows-2;
    int l=rows-2;

	for(int i=1;i<rows;i++)
	{
    for(int j=0;j<s;j++)
    {
        System.out.print(" ");
    }
    s--;
    int y=l;
    for(k=l;k<=rows-1;k++)
    {
        System.out.print( y+" ");
    y++;}
l--;
    System.out.println();
	}
	}
}
