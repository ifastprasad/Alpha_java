package Patterns_part1;

import java.util.Scanner;

public class mvp {
    public static void printnStar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your num = ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        sc.close();
    }
    public static void invartedStar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your numner = ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i+1; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        sc.close();
    }
    public static void halfPira() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enge your number = ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++) {
            for(int j = 1; j<=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void charPira() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your number = ");
        int n = sc.nextInt();
        char c = 'A';
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(c+" ");
                c++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // printnStar();
        // invartedStar();
        // halfPira();
        charPira();
    }
}
