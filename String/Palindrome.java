package String;

import java.util.*;

public class Palindrome {
    public static boolean isPalindrome(String str){
        String str1 = str.replaceAll("[^a-zA-z0-9]","").toLowerCase();
        int left = 0, right = str1.length()-1;
        while(left<right){
            if(str1.charAt(left) != str1.charAt(right)) {
                return false;
            }
            left++;right--;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Enter String here: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(isPalindrome(str));
    }
}
