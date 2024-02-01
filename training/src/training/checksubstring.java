 package training;

public class checksubstring {

	public static void main(String[] args) {
	    String s="sadbutsad";
	    String g="sad";
if( s == null || g == null)
            System.out.print(-1);
        if(s == g)
             System.out.print(0);
       int n = g.length();
        int h = s.length();
        for( int i =0 ; i< (h -n+1 ); i++){
            if(s.substring(i , i + n).equals(g))
            {
                 System.out.print(i);
                 break;
            }  
        }
          // System.out.print(-1);
        

	}

}
