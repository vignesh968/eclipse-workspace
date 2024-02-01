package training;

public class Armstrongseries {
	public static void main(String[]args)
	{
		int start=1;
		int end=200;
	int res=0;

	int h=0;
	for(int i=start;i<=end;i++)
	{
		if(arm(i)==0)
		System.out.print(i+" ");
	}
	
	}
	public static int arm(int i)
	{
		int g=0;
		int od=i;
		int odf=i,odg=i;
		int h=0;
		int res=0;
	while(od>0)
	{
		od/=10;
		h++;
	}
	while(odf>0)
	{
		int f=odf%10;
		res+=Math.pow(f, h);
		odf/=10;
	}
	if(res!=odg)
	{
	g=1;
	}
return g;
		
	}
}
