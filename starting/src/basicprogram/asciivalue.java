package basicprogram;
import java.util.*;
public class asciivalue {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter a character: ");
		char a=scanner.next().charAt(0);
		int b=a;
		System.out.println("ASCII VALUE OF"+a+"is : "+b);
	}
}
