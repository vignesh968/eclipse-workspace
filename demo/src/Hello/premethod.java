package Hello;

import java.util.Scanner;

class hi{
  int num1,num2,result;

    public void add(int num1,int num2)
    {
    	this.num1=num1;
    	this.num2=num2;
    	result=this.num1+this.num2;
    	System.out.println(result);
    }
}

public class premethod{
    public static void main(String []args){
       Scanner sc=new Scanner(System.in);
       System.out.println("enter a two number");
       int n1=sc.nextInt();
       int n2=sc.nextInt();
    	hi ob=new hi();
        ob.add(n1,n2);
    }
}
