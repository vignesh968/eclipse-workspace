package training;
import java.util.*;
public class TwodimentionalArray {
public static void main(String[]args)
{
	int a[][]= {{2,3,4,5},
			{5,6,7,8},
			{94,1,2,3}};
	Set<Integer>res=new HashSet<Integer>();
for(int i=0;i<a.length;i++)
{
	for(int j=0;j<a.length;j++)
	{
	res.add(a[i][j]);	
	}
}
String b=res.toString();

System.out.println();

}
}
