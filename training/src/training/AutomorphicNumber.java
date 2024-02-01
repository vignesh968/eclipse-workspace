package training;

public class AutomorphicNumber {
	public static void main(String[] args) {
		//System.out.println("Hello World");
	int num=23;
	int m=(int)Math.pow(num,2);//5776
	int p=num;
	int c=0;
	
	while(p>0)
	{
	    c++;
	    p/=10;
	}
	int k=m;
	int y=0;
	while(k>0&&c>0)
	{
	    int t=k%10;
	    y=y*10+t;
	    k/=10;
	    
	    c--;
	    
	}
	int h=y,res=0;
	while(h>0)
	{
	    int t=h%10;
	    res=res*10+t;
	    h/=10;
	}

if(num==res)
{
    System.out.print(num+" is automorphic");
}
else{
    System.out.print(num +" is not a automorphic");
}
	}
}
