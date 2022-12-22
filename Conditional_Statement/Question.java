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
    public static void main(String arg[]) {
        odd_even();
    }
}