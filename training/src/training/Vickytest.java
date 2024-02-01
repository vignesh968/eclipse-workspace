package training;

public class Vickytest {
public static void main(String[]args) {
String s="timstimredtim";
String t="tim";
int k=s.length();
int g=t.length();
String f="";
int c=0;
for(int i=0;i<k-g;i++)
{
	f=s.substring(i,i+g-1);
	if(f.equals(t))
	{
		c++;
	}
}
System.out.println(c);
}
}
