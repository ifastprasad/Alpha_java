package Bit_Menuplation;

import java.security.PublicKey;

public class Mvq {
    public static void oddorEven(int n) {
        int bitmask = 1;
        if((n & bitmask)==0) {
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
    }
    
    public static void getIthBit(int n, int i) {
        int bitmask = (1<<i);
        if((n & bitmask) == 0) {
            System.out.println("Ith bit = "+0);
        }else {
            System.out.println("Ith bit = "+1);
        }
    }
    public static int clearIthBit(int n, int i) {
        int bitmask = ~(1<<i);
        n = n & bitmask;
        return n;
    }
    
    public static void setIthBit(int n, int i) {
        int bitmask = 1<<i;
        n = n | bitmask;
        System.out.println(n);
    }

    public static void updateIthBit(int n, int i, int newBit) {
        if(newBit == 0) {
            clearIthBit(n, i);
        }else {
            setIthBit(n, i);
        }
    }
    public static int updateIthBit2(int n, int i, int newBit) {
        n = clearIthBit(n, i);
        int bitmask = newBit<<i;
        return (n|bitmask);
    }

    public static void clearLastIhtBit(int n, int i) {
        int bitmask = (~0)<<i;
        n = n & bitmask;
        System.out.println(n);
    }

    public static void clearInRange(int n, int i, int j) {
        int a = (~0)<<(j+1);
        int b = (1<<i)-1;
        int bitmask = a | b;
        n = n & bitmask;
        System.out.println(n);
    }

    public static boolean isPowerof2(int n) {
        int bitmask = n-1;
        return (n & bitmask) == 0;
    }

    public static void countSetBit(int n) {
        int count = 0;
        while(n>0) {
            if((n & 1) != 0) {
                count++;
            }
            n = n>>1;
        }
        System.out.println(count);
    }

    public static void fastExpo(int a, int n) {
        int ans =1;
        while(n > 0) {
            if((n & 1) !=0) {
                ans *= a;
            }
            a *= a;
            n = n>>1;
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        // System.out.println(5<<2);
        // oddorEven(5);
        // getIthBit(5, 1);
        // setIthBit(5, 1);
        // clearIthBit(7, 1);
        // clearLastIhtBit(15, 2);
        // System.out.println(isPowerof2(5));
        // countSetBit(7);
        fastExpo(2, 3);
    }
}