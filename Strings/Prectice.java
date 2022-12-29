package Strings;

public class Prectice {
    public static void counVowels(String str) {
        int count = 0;
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
                count++;
            }
        }
        System.out.println(count+" -> times lowercase vowels occurred in a String entered by the user.");
    } 
    public static void main(String[] args) {
        String str = "krishna";
        counVowels(str);
    }
}
