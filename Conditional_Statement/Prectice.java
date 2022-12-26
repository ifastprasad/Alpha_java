package Conditional_Statement;

import java.util.*;

public class Prectice {
    public static void question1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your number : ");
        int nub = sc.nextInt();
        String ans = (nub >= 0)? "Nuner is positive" : "Numbe is negative";
        System.out.println(ans);
        sc.close();
    }

    public static void chakeFever() {
        Scanner sc = new Scanner(System.in);
        double d = sc.nextDouble();
        String cf = (d <= 99)? "You don't have a fever.":"You have a fever.";
        System.out.println(cf);
        sc.close();
    }

    public static void printDays() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number = ");
        int num = sc.nextInt();
        switch(num) {
            case 1:System.out.println("Monday");
            break;
            case 2:System.out.println("Tuesday");
            break;
            case 3:System.out.println("Wednesday");
            break;
            case 4:System.out.println("Thursday");
            break;
            case 5:System.out.println("Friday");
            break;
            case 6:System.out.println("Saturday");
            break;
            case 7:System.out.println("Sunday");
            break;
            default: System.out.println("enter valid week days.");
        }
        sc.close();
    }
    public static void printLeepyear() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your year = ");
        int year = sc.nextInt();
        if(year % 4 == 0) {
            if(year % 100 == 0) {
                if(year % 400 == 0) {
                    System.out.println("This is leep years");
                }else{
                    System.out.println("This is not leep years");
                }
            }else {
                System.out.println("This is leep years");
            }
        }else {
            System.out.println("This is not leep years");

        }
        sc.close();
    }

    public static void leep2(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the year: ");
        int year = sc.nextInt();
        boolean x = (year % 4) == 0;
        boolean y = (year%100) !=0;
        boolean z = ((year%100==0) && (year%400==0));
        if(x && (y||z)) {
            System.out.println(year + " is a leap year");
        }else {
            System.out.println(year+" is not a leapyear");
            }
        }
    public static void main(String arg[]) {

    }
}