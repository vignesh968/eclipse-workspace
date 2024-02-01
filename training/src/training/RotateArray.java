package training;

public class RotateArray {
	public static void main (String[]args)
	  {

			String r="";
	    int arr[]={1,2,3,4,5,6,7};
			int f=3+1 ;//3
	        //String b=""+a;
	        int len=arr.length-1;
	        int l1=arr.length;
	        
	        
	        for(int i=0;i<l1;i++)
	        {int k=f;
	        int p=i;
	            
	        	int num=arr[i];
	            while(k>0&&l1>p)
	            {
	                if(p==len)
	                {
	               p=0;     
	                }
	                else{
	                p++;
	                }
	                k--;
	            }
	            r+=""+arr[p];
	        }
	        System.out.print(r);
	  }
}
