package training;
import java.util.*;
public class Rotatedigit {
	public static void main(String args[]) 
	{
		Scanner s=new Scanner(System.in);
		
		int a=5678;//5678
		int f=14 ;//3
        String b=""+a;
        int len=b.length()-1;
        int l1=b.length();
        if(f>len+1)
        {
        	f=f%(l+1);
        }
        String r="";
        for(int i=0;i<l1;i++)
        {int k=f;
        int p=i;
            char d=b.charAt(i);
        	int num=d-'0';
            while(k>0&&l1>p)
            {
                if(p==len)
                {
               p=0;     
                }
                else{
                p++;
                }
                k--;
            }
            r+=""+b.charAt(p);
        }
        System.out.print(r);
	}
}
