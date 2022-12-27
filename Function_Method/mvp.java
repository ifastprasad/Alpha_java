package Function_Method;

import java.util.*;

import javax.xml.crypto.KeySelector.Purpose;

public class mvp {
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static float sum(float a, float b) {
        return a + b;
    }

    public static int fectorial(int n) {
        int fec = 1;
        for(int i=1; i<=n; i++) {
            fec*=i;
        }
        return fec;
    }

    public static int find_binocofi(int n, int r) {
        //BinomialCofficient
        // int fecn = fectorial(n);
        // int fecr = fectorial(r);
        // int nr = fectorial(n-r);

        return  fectorial(n) / (fectorial(r) * (fectorial(n-r)));
    }

    // optimize 
    public static boolean isPrime(int n) {
        if(n==2) {
            return true;
        }
        for(int i=2; i<=Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primeInRange(int n) {
        for(int i=2; i<=n; i++) {
            if(isPrime(i)){
                System.out.print(i +" ");
            }
        }
    }

    public static void printbinTodec(int bin) {
        int pow = 0;
        int dec = 0;
        while(bin > 0) {
            int lastdi = bin % 10;
            dec += (lastdi*(int)Math.pow(2, pow));
            pow++;
            bin/=10;
        }
        System.out.println(dec);
    }

    public static void decTobin(int n) {
        int pow = 0;
        int bin = 0;
        while(n > 0) {
            int rem = n % 2;
            bin = bin + (rem * (int)Math.pow(10, pow));
            pow++;
            n = n/2;
        }
        System.out.println("dec to bin = "+bin);
    }

    public static void main(String arg[]) {
        // System.out.println(sum(4, 5));
        // int a = 5;
        // int b =7;
        // swap(a, b);
        // int bc =  find_binocofi(5, 2);
        // System.out.println("BinomialCofficient = " + bc);
        // System.out.println(isPrime(7));
        // primeInRange(100);
        // printbinTodec(100);
        decTobin(5);

    }



    
}