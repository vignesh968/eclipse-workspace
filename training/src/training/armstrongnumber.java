package training;

public class armstrongnumber {
public static void main(String[]args)
{
	int a=153;
int t=a,p=a;

int h=0;
while(a>0)
{
	a/=10;
	h++;
}
int res=0,v=0;
while(t>0)
{
	v=t%10;
	res+=Math.pow(v, h);
	t/=10;
}
if(res==p)
{
	System.out.print("Armstrong");
}
else
{

	System.out.print("not Armstrong");	
}
}

}