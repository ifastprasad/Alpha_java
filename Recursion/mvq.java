package Recursion;

import javax.print.FlavorException;

public class mvq {
    public static void printDec(int n) {
        if(n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);


    }
    public static void printIncr(int n) {
        if(n == 1) {
            System.out.print(n+" ");
            return;
        }
        printIncr(n-1);
        System.out.print(n +" ");
    }

    public static int printFec(int n) {
        if(n==0) {
            return 1;
        }
        int fn1 = printFec(n-1);
        int fn = n* fn1;
        return fn;
    }

    public static int firstNatNam(int n) {
        if(n==1) {
            return 1;
        }

        int fnn1 = firstNatNam(n-1);
        int sumoff = n + fnn1;

        return sumoff;
    }

    public static int fibnachi(int n) {
        if(n == 0 || n == 1) {
            return n;
        }

        int fib1 = fibnachi(n-1);
        int fib2 = fibnachi(n - 2);
        int fib = fib1 + fib2;

        return fib;
    }

    public static boolean isSorted(int arr[], int i) {
        if(i == arr.length-1) {
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }

    public static int firOcrecance(int arr[], int key, int i) {
        if(i == arr.length-1 ) {
            return -1;
        }

        if(key == arr[i]) {
            return i;
        }

        return firOcrecance(arr, key, i+1);
    }

    public static int lastOccrance(int arr[], int key, int i) {
        if( i==arr.length) {
            return -1;
        }

        int isfoun = lastOccrance(arr, key, i+1);
        if(isfoun == -1 && arr[i] == key) {
            return i;
        }

        return isfoun;
    }

    public static int xpowern(int x, int n) {
        if(n==0) {
            return 1;
        }
        int pow1 =  xpowern(x, n-1);
        int pow = x * pow1 ;
        return pow;

        // return xpowern(x, n-1) * x;
    }

    public static int optimizePow(int x , int n) {
        if(n==0) {
            return 1;
        }
        int half = optimizePow(x, n/2);
        if(n%2==0) {
            return half * half;
        }else {
            return x * half * half;
        }
        
    }
    public static int tilingProblem(int n) {//2 x n (flow size)
        if(n==0 || n==1) {
            return 1;
        }

        // verticle choise 
        int verticleCoise = tilingProblem(n-1);

        // horijontal choise
        int horijontalChoise = tilingProblem(n-2);

        int totalWays = verticleCoise + horijontalChoise;

        return totalWays;
    }

    public static void removeDublicate(String str, int i, StringBuilder newStr, boolean map[]) {
        if(i == str.length()) {
            System.out.println(newStr.toString());
            return;
        }
    
        char currChar = str.charAt(i); 
        if(map[currChar-'a'] == true) {
            // dublicate 
            removeDublicate(str, i+1, newStr, map);
        }else {
            map[currChar - 'a'] = true;
            removeDublicate(str, i, newStr.append(currChar), map);
        }
    }

    public static int friendPairs(int n) {
        //base case 
        if(n==1||n==2) {
            return n;
        }

        //choise
        //single 
        int sing = friendPairs(n-1);
        //pairs
        int pair = friendPairs(n-2);
        int priways = (n-1) * pair;

        //totalways
        int totalpair = sing + priways;

        return totalpair;
    }

    public static void printBinString(int n, int lastplce, String str) {
        // without consecutive ones
        if(n==0) {
            System.out.println(str);
            return;
        }

        printBinString(n-1, 0, str+("0"));
        if(lastplce == 0) {
            // sit 0 on chair n
            printBinString(n-1, 1, str+("1"));
        }
    }
    public static void main(String[] args) {
        // printDec(10);
        // printIncr(10);
        // System.out.println(printFec(5));
        // System.out.println(firstNatNam(5));
        // System.out.println(fibnachi(5));
        int arr[] = {1,2,3,4,5,6,3,4};
        int key = 4;
        // System.out.println(isSorted(arr, 0));

        // System.out.println(firOcrecance(arr, key, 0));
        // System.out.println(lastOccrance(arr, key, 0));
        // System.out.println(xpowern(2, 3));
        // System.out.println(tilingProblem(4));
        // String str = "apnacollage";
        // removeDublicate(str, 0, new StringBuilder(""), new boolean[26]);
        // System.out.println();  
        
        //System.out.println(friendPairs(3));
        printBinString(3, 0, "");
    }
}
    