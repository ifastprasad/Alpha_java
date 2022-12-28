import java.util.*;

public class Start {

    public static void printoneto10() {
        int i = 1;
        while(i<=10) {
            System.out.println(i);
            i++;
        }
    }
    public static void sum_natural_nuber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your first natural number = ");
        int a = sc.nextInt();
        int sum = 0;
        for(int i=1; i<=a; i++) {
            sum+=i;
        }
        System.out.println("Sum of first natural naumber = "+sum);
        sc.close();
    }
    public static boolean primeorNot(int n) {
        if(n == 2) {
            return true;
        }else {
            for(int i = 2 ; i<n; i++) {
                if(n % i == 0) {
                    return false;
                }
            }
        } 
        return true;
    }
    public static void print_N_primeNumb() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your nuber : ");
        int n = sc.nextInt();
        for(int i = 2; i<=n; i++) {
            if(primeorNot(i) == true) {
                System.out.print(i+" ");
            }
        }
        sc.close();
    }
    public static void printSumof_odd_even() {
        Scanner sc = new Scanner(System.in);
        int oddSum = 0;
        int evenSum = 0;
        int choise;
        do { 
            System.out.print("Enter your number = ");
            int num = sc.nextInt();
            if(num % 2 == 0) {
                evenSum += num;
            }else {
                oddSum += num;
            }
            System.out.print("Do you want to continue? Press 1 for yes or 0 for no = ");
            choise = sc.nextInt();
        }while(choise == 1);

        System.out.println("Sum of even numbers: "+evenSum);
        System.out.println("Sum of odd numbers: "+oddSum);
        sc.close();
    }

    public static void find_Fectorial() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number = ");
        int n = sc.nextInt();
        long fec = 1;
        for(int i = 1; i<=n; i++) {
            fec *= i; 
        }
        System.out.println("Fectorial "+ n +" of = "+ fec);
    }
    public static void prinTable() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number = ");
        int n = sc.nextInt();
        for(int i = 1; i <=10; i++) {
            for(int j=1; j<=n; j++) {
                System.out.print(i*j+"  ");
            }
            System.out.println();
        }
    }
    public static void main(String agr[]) {
        // printoneto10();
        // sum_natural_nuber();
        // System.out.println(primeorNot());
        // print_N_primeNumb();
        // printSumof_odd_even();
        // find_Fectorial();
        // prinTable();
    }
}