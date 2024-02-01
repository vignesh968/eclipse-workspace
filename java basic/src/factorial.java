import java.util.*;
public class factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String n=sc.nextLine();
		int a[]= {0,1,2,3,4,5,6,7,8,9};
		String b[]= {" ","&'(","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	int slen=b.length;
	int alen=a.length;
	String l="";
	for(int p=0;p<n.length();p++)
	{
		char x=n.charAt(p);
	for(int i=0;i<slen;i++)
	{
		for(int j=0;j<alen;j++)
		{
			for(int k=0;k<b[i].length();k++)
			{
				if(b[i].charAt(k)==x)
				{
				for(int g=1;g<k+1;g++)
				{
					System.out.print(a[i]);
				}
				}
			}
		}
	}
	}
	}

}
