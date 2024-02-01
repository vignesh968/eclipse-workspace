package basicprogram;
import java.util.*;
public class QuotientRemainder {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter a value 1");
		int a=scanner.nextInt();
	
		System.out.println("enter a value 2");
	int b=scanner.nextInt();
	int c=a/b;
	int d=a%b;
	System.out.println("Quotient: "+c);
	System.out.println("Remainder"+d);
	}

}
