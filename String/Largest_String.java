package String;

import java.util.Scanner;

public class Largest_String {
    public static String largestString(String str){
        String[] words = str.split("\\s");
        StringBuilder st = new StringBuilder();
        int max = 0;
        for(String word:words){
            if(word.length() > max){
                max = word.length();
            }
        }
        for(String word:words){
            if(word.length() == max){
                st.append(word);
                break;
            }
        }
        return st.toString();
    }
    public static void main(String[] args) {
        System.out.println("Enter the string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(largestString(str));
    }
}
