package Array;

public class mvq {
    public static void linnerSerch(int arr[], int key) {
        int id = -1;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == key) {
                id=i;
            }
        }
        if(id == -1) {
            System.out.println(-1);
        }else {
            System.out.println(id);
        }
    }

    public static void menuSerch(String arr[], String key) {
        int id = -1;
        for(int i=0; i < arr.length; i++) {
            if(arr[i] == key) {
                id = i;
            }
        }
        if(id == -1) {
            System.out.println(-1);
        }else {
            System.out.println(id);
        }
    }

    public static int binarSerch(int arr[], int key) {
        int si = 0, ei = arr.length-1;

        while(si <= ei) {
            int mid = (si + ei) / 2;

            if(arr[mid] == key) {
                return mid;
            }

            if(arr[mid] < key) {// right
                si = mid + 1;
            }else {//left
                ei = mid-1;
            }
        }
        return -1;
    }

    public static void reverseArr(int arr[]) {
        int si = 0, ei = arr.length-1;
        while(si < ei) {
            int temp = arr[si];
            arr[si] = arr[ei];
            arr[ei] = temp;
            si++;
            ei--;
        }
    }
    public static void printArr(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void printPair(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                System.out.print("("+i+", "+j+") ");
            }
            System.out.println();
        }
    }
    public static void printSubArr(int arr[]) {
        int min_subarr_sum = Integer.MAX_VALUE;
        int max_subarr_sum = 0;
        for(int i = 0; i<arr.length; i++) {
            for(int j = i; j<arr.length; j++) {
                int subArrysum = 0;
                for(int k = i; k<=j; k++) {
                    System.out.print(arr[k]+" ");
                    subArrysum+=arr[k];
                }
                System.out.println(" sumbarry sum = "+subArrysum);
                if(min_subarr_sum > subArrysum) {
                    min_subarr_sum = subArrysum;
                }
                if(max_subarr_sum <subArrysum) {
                    max_subarr_sum = subArrysum;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Min Subarray sum = "+min_subarr_sum);
        System.out.println("Max Subarray sum = "+max_subarr_sum);
    }

    public static void maxSubarrySum(int arr[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        
        for(int i=1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        for(int i=0; i<arr.length; i++) {
            int start = i;
            for(int j=i; j<arr.length; j++) {
                int end = j;

                currSum = (start == 0)? prefix[end] : prefix[end]-prefix[start-1];

                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("maxSum in subarry = " + maxSum);
    }

    public static void buyAndSell_Stock(int price[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0; i<price.length; i++) {
            if(buyPrice < price[i]) {
                int profit = price[i] -buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }else {
                buyPrice = price[i];

            }
        }
        System.out.println("My profit = "+ maxProfit);
    }

    public static void kadanes(int arr[]) {
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(cs < 0) {
                cs = 0;
            }
            cs = cs + arr[i];
            ms = Math.max(ms, cs);
        }
        System.out.println("max subarraysum = "+ ms);
    } 

    public static void trapRainWater(int arr[]) {
        // to claculate left max boundry
        int leftmaxbon[] = new int[arr.length];
        leftmaxbon[0] = arr[0];
        for(int i = 1; i<leftmaxbon.length; i++) {
            leftmaxbon[i] = Math.max(arr[i], leftmaxbon[i-1]);
        }
        // to calculate right max boundry
        int rightmaxboun[] = new int[arr.length];
        rightmaxboun[rightmaxboun.length-1] = arr[arr.length-1];
        for(int i = arr.length-2; i>=0; i--) {
            rightmaxboun[i] = Math.max(arr[i], rightmaxboun[i+1]);
        }
        //water lable
        int trapwater = 0;
        for(int i=0; i<arr.length; i++) {
            int waterlable = Math.min(leftmaxbon[i], rightmaxboun[i]);
            trapwater += waterlable - arr[i]; 
        }

        // trap water
        System.out.println("Trap Rain water = "+trapwater);
    }
    public static void main(String arg[]) {
        // int arr[] = new int[5];
        // arr[0] = 90;
        // arr[1] = 49;
        // arr[2] = 59;
        // arr[3] = 7;
        // arr[4] = 10;
        // // arr[5] = 50;
        // linnerSerch(arr, 90);
        // String menu[] = {"momos","chowmin", "stev momos", "egg roll"};
        // menuSerch(menu, "egg roll");

        // int arr2[] = {-2,-5,7,8,9,-7};
        // System.out.println(binarSerch(arr2, 17));
        // printArr(arr2);
        // reverseArr(arr2);
        // System.out.println();
        // printArr(arr2);
        // printPair(arr2);
        // printSubArr(arr2);
        // maxSubarrySum(arr2);
        // kadanes(arr2);
        // int hight[] = {4,2,0,6,3,2,5};
        // trapRainWater(hight);
        int price[] ={7,1,5,3,6,4};
        buyAndSell_Stock(price);
    }
}
 