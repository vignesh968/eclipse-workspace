package array;
import java.util.*;
class Stringacceptchar
{
    public static void main(String []args)
    {
        String a="Vic537ky1234@";
        a=a.toLowerCase();
        String b="";
        Set<Character>r=new TreeSet<Character>();
        Set<Integer>ll=new TreeSet<Integer>();
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)>='a'&&a.charAt(i)<='z')
            {
                r.add(a.charAt(i));
            }
            else if(a.charAt(i)>='0'&&a.charAt(i)<='9')
            {
            	b+=a.charAt(i);
            }
         
        }
        for(char t:r)
        {
        	   System.out.print(t);	
        	   
        }
       
       char[] ar=b.toCharArray(); 
        for(int i=0;i<ar.length;i++)
        {
        	for(int j=i+1;j<ar.length;j++)
        	{
        		if(ar[j]<ar[i])
        		{
        			char temp=ar[i];
        			ar[i]=ar[j];
        			ar[j]=  temp;
        		}
        	}
        	System.out.print(ar[i]);
        }}
}