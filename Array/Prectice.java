package Array;

public class Prectice {
    public static boolean question1(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i]==arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void question3(int price[]) {
        int buyprice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0; i<price.length; i++) {
            if(buyprice < price[i]){
                int profit = price[i]-buyprice;
                maxProfit = Math.max(maxProfit, profit);
            }else {
                buyprice = price[i];
            }
        }
        if(maxProfit < 0) {
            maxProfit = 0;
        }
        System.out.println("my max Profit = "+ maxProfit);
    }

    public static void trapWater(int hight[]) {
        int n = hight.length;
        int trapwater = 0;
        // caluate leftmaxbon
        int lmb[] = new int[n];
        lmb[0] = hight[0];
        for(int i=1; i<n; i++) {
            lmb[i] = Math.max(hight[i], lmb[i-1]);
        }
        // caluate rightmaxbon
        int rmb[] = new int[n];
        rmb[rmb.length-1] = hight[n-1];
        for(int i=rmb.length-2; i>=0; i--) {
            rmb[i] = Math.max(hight[i], rmb[i+1]);
        } 
        // water lable and trap water
        for(int i=0; i<n; i++) {
            int waterlable = Math.min(lmb[i], rmb[i]);
            trapwater+=waterlable-hight[i];
        }
        System.out.println("Trap Water = " +trapwater);
    }

    public static void question5(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                for(int k=j+1; k<arr.length; k++) {
                    if(arr[i] + arr[j] + arr[k] == 0) {
                        System.out.print(" ["+arr[i]+", "+arr[j]+", "+arr[k]+"] ");
                    }
                }
            }
        }
    }
    public static void main(String arg[]) {
        // int nums[] = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        // System.out.println(question1(nums));
        // int price[] = {7, 6, 4,  3, 1};
        // question3(price);
        // int hight[] = {4, 2, 0, 3, 2, 5};
        // trapWater(hight);
        int nums[] = {-1, 0,  1, 2, -1, -4};
        question5(nums); 
    }
}