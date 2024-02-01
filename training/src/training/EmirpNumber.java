package training;

public class EmirpNumber {
	public static void main(String[] args) {
int a=6;
int c=0;
for(int i=2;i<a;i++)
{
    if(a%i==0)
    {
        c++;
    }
}
if(c==0)
{
    String s=""+a;
    String v="";
    for(int i=s.length()-1;i>=0;i--)
    {
        v+=s.charAt(i);
    }
    c=0;
    int n=Integer.parseInt(v);
    for(int j=2;j<n;j++)
    {
        if(n%j==0)
        {
        c++;    
        }
    }
    if(c==0)
    {
        System.out.print("Emirp Number");
    }
    else{
                System.out.print("not  Emirp Number");
    }
}
else{
                System.out.print("not a Emirp Number");
    }
	}
}
