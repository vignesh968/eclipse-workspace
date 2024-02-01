
package strings;
import java.util.*;
public class Stringmethod {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String e=s.nextLine();
		char ch[]=new char[100];
		e.getChars(0, e.length(), ch, 0);
		//ch=e.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a'|| ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
			{
				System.out.print("=");
			}
			else
			{
				System.out.print(ch[i]);
			}
		}
		
//int a=s.nextInt();
//int arr[]=new int[a];
//int arr1[]=new int[a];
//for(int i=0;i<arr.length;i++)
//{
//	arr[i]=s.nextInt();
//}
//System.arraycopy(arr, 0, arr1, 0, 5);
//for(int i=0;i<arr1.length;i++)
//{if(arr1[i]==0)
//{
//	break;
//}
//else
//{
//	System.out.print(arr1[i]+" ");
//}	
//}

	}

}
