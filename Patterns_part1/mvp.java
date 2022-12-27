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
    }
    public static void main(String[] args) {
        printnStar();
    }
}
