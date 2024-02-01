import java.util.*;

public class Hello {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number 1");
		int a=sc.nextInt();
		System.out.println("enter a number 2");
		int b=sc.nextInt();
		 a=a^b;
		b=b^a;
		a=a^b;
		System.out.println(a);
		System.out.println(b);
	}

}
