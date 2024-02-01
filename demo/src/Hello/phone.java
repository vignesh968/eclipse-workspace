package Hello;
import java.util.Scanner;

public class phone {
public static void main(String[]args)
{
    System.out.println("WELCOME TO CHENNAI MOBILES");
    System.out.println("1.samsung"+'\n'+"2.poco"+'\n'+"3.oppo");
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your choice");
    int n=sc.nextInt();
    
    long s;
    switch(n)
    {
        case 1:
            
        	System.out.println("samsung a 20");
            
             
            System.out.println("enter the price:");
            int p=sc.nextInt();
            System.out.println(" enter the discount %");
            int dis=sc.nextInt();
            int pr=p/100*dis;
            System.out.println("The discount price is"+pr);
            int or=p-pr;
            System.out.println("The price of phone"+ or);
            System.out.println("Thank You");
            break;
            
            case 2:
            System.out.println("poco m2 pro");
            
             
            System.out.println("enter the price:");
            int e=sc.nextInt();
            System.out.println(" enter the discount %");
            int dis1=sc.nextInt();
            
            int pr1=e/100*dis1;
            System.out.println("The discount price is"+pr1);
            int or1=e-pr1;
            System.out.println("The price of phone"+ or1);
            System.out.println("Thank You");
            break;
            case 3:
            System.out.println("oppo");
            
             
            System.out.println("enter the price:");
            int i=sc.nextInt();
            System.out.println(" enter the discount %");
            int dis2=sc.nextInt();
            int p1=i/100*dis2;
            System.out.println("The discount price is"+p1);
            int or2=i-p1;
            System.out.println("The price of phone"+ or2);
            System.out.println("Thank You");
            break;
            default:
                System.out.println("nothing");
    }

}    
}
