package Strings;
import java.util.*;

import javax.lang.model.element.Element;

public class Mvq {
    public static void pritStringofCar(String str) {
        for(int i=0; i<str.length(); i++) {
            System.out.print(str.charAt(i)+" ");
        }
    }

    public static boolean isPlaindrome(String str) {
        for(int i=0; i<str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-i-1)) {
                return false;
            }
        }
        return true;
    }

    public static void getsortedPath(String str) {
        int x=0, y=0;
        float sortepath = 0;
        for(int i=0;i<str.length(); i++){
            int dir = str.charAt(i);
            //south
            if(dir=='s') {
                y--;
            }
            else if(dir=='n') {//North
                y++;
            }
            else if(dir =='w'){//West
                x--;
            }else {//East
                x++;
            } 
        }
        sortepath = (float)(Math.sqrt((x*x) + (y*y)));
        System.out.println("Sorted parth = "+sortepath);

    }

    public static void largesString(String str[]) {
        String largest = str[0];
        for(int i=0; i<str.length; i++) {
            if(largest.compareTo(str[i]) < 0) {
                largest = str[i];
            }
        }
        System.out.println(largest);
    }

    public static void stringBuilder() {
        StringBuilder sb = new StringBuilder("");
        for(char i='A'; i<='Z'; i++) {
            sb.append(i);
        }
        System.out.println(sb);
    }

    public static void convertUpperCase(String str) {
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1; i<str.length(); i++) {
            if(str.charAt(i)==' ' && i<str.length()-1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else {
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }

    public static void stringComperser(String str) {
        StringBuilder sb = new StringBuilder("");
        
        for(int i=0; i<str.length(); i++) {
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)) {
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count>1) {
                sb.append(count.toString());
            }
        }
        System.out.println(sb.toString());
    }
    public static void main(String[] args) {
        // String str = "Krisna Prasad";
        // pritStringofCar(str);
        // System.out.println();
        // String str2 = "racpecar";
        // System.out.println(isPlaindrome(str2));
        // String str3 = "wneenesennn";
        // getsortedPath(str3);
        // String str[] = {"mango", "apple", "banana"};
        // largesString(str);
        // stringBuilder();
        String str = "hello i am krishna today i am going to house";
        convertUpperCase(str);
        String str2 = "aaabbcccdd";
        stringComperser(str2);

    }
}
