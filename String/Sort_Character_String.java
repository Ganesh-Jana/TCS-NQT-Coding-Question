package String;

import java.util.Scanner;
import java.util.*;

public class Sort_Character_String {
    public static String sortCharacter(String str){
       char[] char_arr = str.toCharArray();
       Arrays.sort(char_arr);
       String ans = new String(char_arr);
       return ans;
    }
    public static void main(String[] args) {
        System.out.println("Enter the string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(sortCharacter(str));
    }
}
