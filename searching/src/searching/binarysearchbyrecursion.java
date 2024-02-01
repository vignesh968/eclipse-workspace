package searching;
import java.util.*;
public class binarysearchbyrecursion {
	public static void main(String[]args) {
		
		int search=20;
		int arr[]= {10,20,30,40,50,60,70};
		int low =0,h=arr.length-1;
		int mid=(low+h)/2;
		System.out.println(ad(low,h,arr,mid,search));
	}
	public static int ad(int low,int h,int arr[],int mid,int search) {
		
			mid=(low+h)/2;
			//if(low>h) {
			
			//}
			 if(arr[mid]==search)
			{
				return mid;
			}
			else if(arr[mid]>search) {
				return ad(low, mid-1, arr, mid, search);
			}
			else if (arr[mid]<search){
				return ad(mid+1, h, arr, mid, search);
			}
				return -1;
		//return -1;
}
	}
