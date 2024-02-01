package training;

public class lcm {

	public static void main(String[] args) {
	
		 int n1 = 3, n2 = 4, lcm;

		   
		    lcm = (n1 > n2) ? n1 : n2;

		    while(true) {
		      if( lcm % n1 == 0 && lcm % n2 == 0 ) {
		        break;
		      }
		      ++lcm;
		    }
		    System.out.print(lcm/n2+"/"+lcm/n1);
	}

}
