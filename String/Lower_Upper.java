package String;

import java.util.Scanner;

public class Lower_Upper {
    public static String lowerUpper(String str){
        int n = str.length();
        String result = "";
        for(char ch : str.toCharArray()){
            if(Character.isLowerCase(ch)){
                result += Character.toUpperCase(ch);
            }else{
                result += Character.toLowerCase(ch);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Enter your String: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(lowerUpper(str));
    }
}
