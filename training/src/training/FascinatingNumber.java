package training;

public class FascinatingNumber {
	public static void main(String[] args) {
int num, n2, n3;      


num = 327;  
n2 = num * 2;  
n3 = num * 3;  
 
String concatstr = num + "" + n2 + n3;  
boolean found = true;  
int c=0;
 for(char a='1';a<='9';a++)
 {
     c=0;
     for(int i=0;i<concatstr.length();i++)
     {char b=concatstr.charAt(i);
         if(a==b)
         {
             c++;
         }
     }
     if(c==0||c>1)
     {
         found=false;
         break;
     }
 }
 System.out.print((found)?"FascinatingNumber":"not a FascinatingNumber");
	}
}
