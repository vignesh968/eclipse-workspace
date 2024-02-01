package training;

public class AutobiographicalNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			 int x=21200;

			 
			int temp = x;
			int s=0,count=0;

			while (temp > 0)  
			{  
			  
			int t=temp%10;  
			 s+=t;
			 count++;
			temp = temp/10;  
			//increments the number of digits (n) by 1  

			}  
			 


			System.out.print((s==count)?" Autobiographical Number":"not a  Autobiographical Number");
			  
				}
	}

