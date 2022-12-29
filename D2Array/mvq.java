package D2Array;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class mvq {
    public static void creationofMartix() {
        int martix[][] = new int[3][3];
        int n=martix.length, m = martix[0].length;
    //input
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                martix[i][j] = sc.nextInt();
            }
        }
        // Output
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                System.out.print(martix[i][j]+" ");
            }
            System.out.println();
        }

    }

    public static void printSprialMartix(int martix[][]) {
        int stRow = 0; 
        int stCol = 0;
        int enRow = martix.length-1;
        int edCol = martix[0].length-1;

        while(stRow <=enRow && stCol <= edCol) {
            // top
            for(int j=stCol; j<=edCol; j++) {
                System.out.print(martix[stRow][j]+" ");
            }
            // right
            for(int i=stRow; i<=enRow; i++) {
                System.out.print(martix[i][edCol]+" ");
            }
            // bottom
            for(int j=edCol-1; j>=stCol; j--) {
                if(stRow == enRow) {
                    break; 
                }
                System.out.print(martix[enRow][j]+" ");
            }
            // left
            for(int i=enRow-1; i>=stRow+1; i--) {
                if(stCol==edCol) {
                    break;
                }
                System.out.print(martix[i][stCol]+" ");
            }
            stRow++;
            stCol++;
            edCol--;
            enRow--;
        }

    }

    public static void digSum(int martix[][]) {
        int digSum = 0;
        for(int i=0; i<martix.length; i++) {
            for(int j=0; j<martix[0].length; j++) {
                if(i==j){
                    digSum+=martix[i][j];
                }else if(i+j==martix.length-1) {
                    digSum+=martix[i][j];
                }
            }
        }
        System.out.println(digSum);
    }

    public static void stairSerch(int martix[][], int key) {
        int chakekey = 0;
        int row = 0, col = martix[0].length-1;
        while(row < martix.length && col >= 0) {
            if(martix[row][col]==key) {
                System.out.println("["+row+", "+col+"]");
                chakekey++;
                break;
            }
            else if(key < martix[row][col]){
                col--;
            }else {
                row++;
            }
        }
        if(chakekey == 0) {
            System.out.println(-1);
        }
    }
    public static void main(String[] args) {
        int martix[][] = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16}
                         };
        // creationofMartix();
        // printSprialMartix(martix);
        // digSum(martix);
        stairSerch(martix, 13);
    }
}
