package searching;
import java.util.*;
public class binarysearchbyiterative {
public static void main(String[]args) {
	
	int search=50;
	int arr[]= {10,20,30,40,50,60,70};
	int low =0,h=arr.length-1;
	int mid=(low+h)/2;
	System.out.println(ad(low,h,arr,mid,search));
}
public static int ad(int low,int h,int arr[],int mid,int search) {
	
while(low<=h) {
	
		if(arr[mid]==search)
		{
			return mid;
//			break;
		}
		else if(arr[mid]>search)
		{
			h=mid-1;
		}
		else if(arr[mid]<search) 
		{
			low=mid+1;
		}
		mid=(low+h)/2;	
}
return -1;
}
}
