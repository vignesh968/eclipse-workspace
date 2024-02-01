package basicprogram;


import java.util.*;

public class SwapTwoNumbers  {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("enter a row size");
        int a = S.nextInt();
        System.out.println("enter a column size");
        int b = S.nextInt();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
