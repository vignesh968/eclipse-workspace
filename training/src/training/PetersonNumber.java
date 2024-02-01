package training;

public class PetersonNumber {
	public static void main(String[] args) {
		//System.out.println("Hello World");
	int num=773;
    int res=1;	
	int p=num;
	int ans=0;
	while(p>0)
	{res=1;
	    int t=p%10;
	    for(int i=1;i<=t;i++)
	    {
	        res=res*i;
	    }
	    ans+=res;
	    p/=10;
	}
	System.out.print((num==ans)?" Peterson number":"Not a  Peterson number");
}
}