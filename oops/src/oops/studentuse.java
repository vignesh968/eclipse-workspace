package oops;

import java.util.Scanner;

//access modifiers
//public 
//private 
//default -can access with in the same package
public class studentuse {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter your name: ");
		String a=scanner.next();
		System.out.println("enter a rollno: ");
		int roll=scanner.nextInt();
	student s1=new student();
	student s2=new student("vicky");
	student s3=new student(roll,a);
	student s4=new student();
s1.print();
s2.print();
s3.print();
s4.print();



	}

}
