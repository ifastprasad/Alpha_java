package Function_Method;

public class prectice {
    public static int av_of_3Num(int a, int b, int c) {
        return (a+b+c)/3;
    }

    public static boolean isEven(int n) {
        return n % 2==0;
    }

    public static boolean isPelindrome(int n) {
        int ol = n;
        int ne = 0;
        while(n > 0) {
            int lasd = n % 10;
            ne = ne * 10 + lasd;
            n/=10; 
        }
        if(ol != ne) {
            return false;
        }
        return true;
    }
    public static void sumofdig(int n) {
        int sum =0;
        while(n > 0) {
            int lasd = n % 10;
            sum += lasd;
            n/=10;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        // System.out.println(isEven(4));
        System.out.println(isPelindrome(121));
        sumofdig(121);
    }
}