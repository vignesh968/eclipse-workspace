package searching;

public class indexoffirstoccur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int search=4;
int arr[]= {1,2,7,3,4,4,5,5,5,6,7};

for(int i=0;i<arr.length;i++)
{
if(arr[i]==search)
{
	System.out.println(i);
	break;
}
}
}

}