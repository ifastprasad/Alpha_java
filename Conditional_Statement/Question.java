package Conditional_Statement;

import java.util.*;

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
        sc.close();
    }

    public static void incomeTexCal() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your income : ");
        int income = sc.nextInt();
        if(income < 50_0000) {
            System.out.println("your income tax = 0");
        }else if(income >= 50_0000 && income <=10_00000) {
            System.out.println("your income tax = " + (income * 20)/100);
        }else if(income > 10_00000) {
            System.out.println("your income tax = " + (income * 30)/100);
        }
        sc.close();
    }
    public static void tarnaryOprator() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number = ");
        int a = sc.nextInt();
        System.out.print("Enter your second number = ");
        int b = sc.nextInt();
        int max = (a >= b)? a : b;

        System.out.println("This is grager your second number = "+max);
        sc.close();
    }

    public static void studentResult() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks = ");
        int marks = sc.nextInt();
        String result = (marks >= 33)? "Pass" : "Fail";
        System.out.println("You are "+result);
        sc.close();
    }
    public static void orderCase() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your case : ");
        int num = sc.nextInt();

        switch(num) {
            case 1: System.out.println("Samosa");
            break;
            case 2: System.out.println("itli");
            break;
            case 3: System.out.println("momosh");
            break;
            default: System.out.println("Plaz.. enter your valid case");
        }
        sc.close();
    }
    public static void calcultor() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number = ");
        int num1 = sc.nextInt();
        System.out.print("Enter your second number = ");
        int num2 = sc.nextInt();
        System.out.print("Enter your oprator number = ");
        char op = sc.next().charAt(0);
        switch(op) {
            case '+': System.out.println(num1 + num2);
            break;
            case '-': System.out.println(num1 - num2);
            break; 
            case '/': System.out.println(num1 / num2);
            break;
            case '%': System.out.println(num1 % num2);
            break;
            default: System.out.println("plaz.. enter valid oprator");
        }
        sc.close();
    }
    public static void main(String arg[]) {
        // odd_even();
        // largesof2Number();
        // incomeTexCal();
        // System.out.println();
        // tarnaryOprator();
        // studentResult();
        // orderCase();
        calcultor();

    }
}