package training;

public class SpyNumber {
	public static void main(String[] args) {
 int x=123;

 
int temp = x;
int s=0,p=1;

while (temp > 0)  
{  
  
int t=temp%10;  
 s+=t;
 p*=t;
temp = temp/10;  
//increments the number of digits (n) by 1  

}  
 


System.out.print((s==p)?"spy number":"not a spy number.");
  
	}
}
