package training;

public class PalindromeString {
	public static void main(String[] args) {
		String a="madam";
		int len=a.length();
		
		String f="";
		int k=1;
		int c=0;
		String b="";
		
		int p=0;
		while(len>0)
		{
		    f="";
		    b="";
			for(int i=0;i<len-p;i++)
			{
				b+=a.charAt(i);
			}
			for(int i=len-k;i>=0;i--)
			{
				f+=a.charAt(i);
			}
			if(f.equals(b))
			{
				c++;
			}
			k++;
			p++;
			len--;
		}
System.out.println(c);
	}
}
