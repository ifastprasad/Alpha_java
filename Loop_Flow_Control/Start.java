package Loop_Flow_Control;

import java.util.Scanner;

public class Start {
    public static void print_lar_3num() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your fir Num = ");
        int a = sc.nextInt();
        System.out.print("Enter your sec Num = ");
        int b = sc.nextInt();
        System.out.print("Enter your thi Num = ");
        int c = sc.nextInt();

        if(a >= b && a >= c) {
            System.out.println( a +" Is a grater");
        }else if(b >= c) {
            System.out.println(b + " Is a grater");
        }else{
            System.out.println(c + " Is a grater");
        }
        sc.close();
    }

   
    public static void main(String agr[]) {
        print_lar_3num();
    }
}