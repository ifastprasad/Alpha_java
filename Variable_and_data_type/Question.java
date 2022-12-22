package Variable_and_data_type;

import java.util.*;

public class Question {

    public static void avrage_of_3_Number() {
        // Question no -> 1
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first Number : ");
        int fn = sc.nextInt();
        System.out.print("Enter your Secpmd Number : ");
        int sn = sc.nextInt();
        System.out.print("Enter your Third Number : ");
        int tn = sc.nextInt();

        System.out.println("Avarage of 3 Number = "+(float)(fn + sn + tn)/3);
        sc.close();
    }

    public static void area_of_Squar() {
        // Question no -> 2
        Scanner sc = new Scanner(System.in);
        System.out.print("type of side : ");
        int s = sc.nextInt();

        System.out.println("area of Sqar = "+ s * s);
        sc.close();
    }

    public static void cost_of_Product() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Price of Pen : ");
        float pen = sc.nextFloat();
        System.out.print("Price of Pencil : ");
        float pencil = sc.nextFloat();
        System.out.print("Price of eraser : ");
        float er = sc.nextFloat();
        float realpri = pen + pencil + er;

        float tex = (float)(realpri * 18/100);

        float Total = tex + realpri;

        System.out.println("Total price with inculude 18% = " + tex + " Total price = " + Total);
        sc.close();

    }


    public static void main(String[] args) {
        // avrage_of_3_Number();
        // area_of_Squar();
        cost_of_Product();
        System.out.println("hello every one");

    }
}