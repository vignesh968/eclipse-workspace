package training;

public class IntegertoWord {

	public static void main(String[] args) {
		int a=11;
		int ay[]={0,1,2,3,4,5,6,7,8,9};
		String one[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
		String two[]={"and","ten","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninty","hundred"};;
		String  c[]={"","hundred"};
		int num=a;
		int d=0;

		String ans=""+a;
		String p[]=new String[ans.length()];
		int y=0;
		while(num>0)
		{
		    int t=num%10;

		    if(d==0)
		    {
		        for (int i=0;i<ay.length&&i<one.length;i++ )
		        {
		          if(t==ay[i])
		          {
		              p[y]=one[i];
		          break;}
		        }
		    }

		     else if(d==1)
		    {
		        for (int i=0;i<ay.length&&i<two.length;i++ )
		        {
		          if(t==ay[i])
		          {
		              p[y]=two[i];
		              break;
		          }
		        }
		    }
		     else if(d==2)
		    {
		        for (int i=0;i<ay.length&&i<c.length;i++ )
		        {
		          if(t==ay[i])
		          {
		              p[y]=c[i];
		          break;
		              
		          }
		        }
		    }
		d++;
		y++;
		    num/=10;
		}
		for(int i=p.length-1;i>=0;i--)
		{
		    System.out.print(p[i]+" ");
		}
	}

}
