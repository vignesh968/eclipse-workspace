package training;
import java.util.*;
public class arraysub
{
	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
int c=s.nextInt();
int d=s.nextInt();
int cc=0;
int arr1[][]=new int[a][b];
int arr2[][]=new int[c][d];
int ss[][]=new int[a][b];
for(int i=0;i<a;i++)
{
    for(int j=0;j<b;j++)
    {
arr1[i][j]=s.nextInt();        
    }
}
for(int i=0;i<c;i++)
{
    for(int j=0;j<d;j++)
    {
arr2[i][j]=s.nextInt();        
    }
   
}

for(int i=0;i<a;i++)
{
    for(int j=0;j<b;j++)
    {
ss[i][j]=arr1[i][j]+arr2[i][j];   
System.out.print(ss[i][j]+" ");
    	if(arr1[i][j]!=arr2[i][j])
    	{
    	cc=1;	
    	}
    }
    System.out.println(); 
}

System.out.println((cc==0)?"yes":"no");
	}
}
