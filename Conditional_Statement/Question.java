package Conditional_Statement;

import java.util.Scanner;

public class Question {
    public static void odd_even() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter youu number = ");
        int a = sc.nextInt();
        if(a % 2 == 0) {
            System.out.println("even");
        }else {
            System.out.println("odd");
        }
        sc.close();
    }

    public static void largesof2Number() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your first number : ");
        int a = sc.nextInt();
        System.out.print("Enter your second number : ");
        int b = sc.nextInt();
        if(a > b) {
            System.out.println("greater is a");
        }else {
            System.out.println("greater is b");
        }
    }
    public static void main(String arg[]) {
        // odd_even();
        largesof2Number();

    }
}