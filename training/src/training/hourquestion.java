package training;

public class hourquestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="03:03";
		String b[]=a.split(":");
		String v="";
		//int s=Integer.parseInt(b[0]);
		for(int i=0;i<b[0].length();i++)
		{
			char h = b[0].charAt(i);
				v+=h;
		}
		int c=Integer.parseInt(b[1]);
			int res=Integer.parseInt(v);
			int p=0;
			while(c<res)
			{  p++;
			    c=c+1;
			
			  
			}
	
			System.out.print(p);
	}

}
