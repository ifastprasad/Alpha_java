package D2Array;

import javax.swing.RootPaneContainer;
import javax.swing.plaf.basic.BasicBorders.MarginBorder;

public class Prectice { 
    public static void linnerSerch(int matrix[][], int key) {
        int find = 0;
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                if(matrix[i][j] == key) {
                    find++;
                }
            }
        }
        if(find == 0) {
            System.out.println(-1);
        }else{
            System.out.println(find);
        }
    }
    public static void question2(int martix[][]) {
        int s_Row_sum = 0;
        for(int i=0; i<martix[0].length; i++) {
            s_Row_sum += martix[1][i];
        }
        System.out.println(s_Row_sum);
    }
    public static void Transpose(int martix[][]) {
        int row=2,column=3;
        int[][]transpose=new int[column][row];
        for(int i=0; i<row; i++) { 
            for(int j=0; j< column; j++) {
                transpose[j][i] = martix[i][j];
            }}
    }

    public static void print2dMatrix(int matrix[][]) {
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // int[][] array = { {4,7,8},{8,8,7} };
        // linnerSerch( array, 7);
        // int[][] nums = { {1,4,9},{11,4,3},{2,2,3}};
        // question2(nums);
        int [][] matrix = { {2,3,7}, {5,6,7}};
        print2dMatrix(matrix);
        Transpose(matrix);
        System.out.println();
        print2dMatrix(matrix);

    }
}