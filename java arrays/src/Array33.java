
public class Array33 {

	public static void main(String[] args) {
		int a=4;
		int m=a;
		int arr[][]=new int[3][3];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(i==0&&j==1)
				{
					arr[i][j]=m;
					m+=2;
				}
				else if(i==a-2&&j==a-2)
				{
					arr[i][j]=m;
					m++;
				}
				else if(i==a-3&&j==a-4)
				{
					arr[i][j]=m;
					m+=1;
				}
				else if(i==a-2&&j==a-4)
				{
					arr[i][j]=m;
					m-=2;
				}
				//else if(i==a-4&&j==a-2)
					
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
			 	System.out.print(arr[i][j]);
			}
			System.out.println();
			}
			}

	}

