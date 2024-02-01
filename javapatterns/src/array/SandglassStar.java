package array;

public class SandglassStar {
	public static void main(String[] args) {
	//	System.out.println("Hello World");
	int a=7;
	int s=1;
	for(int i=a-1;i>=0;i--)
	{ for(int j=0;j<=s;j++)
	    {
	        System.out.print(" ");
	    }
	    s++;
	   
	    for(int j=0;j<=i;j++)
	    {
	        System.out.print("* ");
	    }
	    System.out.println();
	}
	 s=a;
	for(int i=1;i<=a;i++)
	{
    for(int j=0;j<=s;j++)
    {
        System.out.print(" ");
    }
    s--;
    for(int k=0;k<i;k++)
    {
        System.out.print("* ");
    }
    System.out.println();
	}
	}
}
