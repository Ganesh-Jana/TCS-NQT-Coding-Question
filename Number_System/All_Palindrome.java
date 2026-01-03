package Number_System;

public class All_Palindrome {
    static boolean isPalindrome(int n){
        int rev = 0;
        int org = n;
        while(n>0){
            int digit = n%10;
            rev = rev*10 + digit;
            n = n/10;
        }
       return rev == org;
    }
    public static void main(String[] args){
        System.out.println("Hello");
       int min = 10, max = 100;
       for(int i = min; i<=max; i++){
           if(isPalindrome(i)){
               System.out.println(i + " ");
           }
       }
    }
}
