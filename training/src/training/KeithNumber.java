package training;
import java.util.*;
public class KeithNumber {

	public static void main(String[] args) {
 int x=742;
ArrayList<Integer> terms=new ArrayList<Integer>();  
 
int temp = x, n = 0;   

while (temp > 0)  
{  
  
terms.add(temp%10);  
 
temp = temp/10;  
//increments the number of digits (n) by 1  
n++;  
}  
 
Collections.reverse(terms);  
int next_term = 0, i = n;  

while (next_term < x)  
{  
next_term = 0;  

for (int j=1; j<=n; j++)  
next_term = next_term + terms.get(i-j);  
terms.add(next_term);  
i++;  
}
System.out.print((x==next_term)?" Keith number":"not a Keith number.");
  
	}

}
