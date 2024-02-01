import java.util.*;
public class welcome
{
	public static void main(String[] args) {
    Scanner sc=new Scanner();
    
    int num=sc.nextInt();
    int []arr=new int[num];
    int i;
    for(i=0;i<num;i++)
    {
        arr[i]=sc.nextInt();
    }
    for(i=0;i<num;i++)
    {
    System.out.println(arr[i]);
    }
	}
}
