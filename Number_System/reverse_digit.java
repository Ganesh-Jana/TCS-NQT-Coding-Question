package Number_System;

public class reverse_digit {
    static int isReverse(int n){
        int rev = 0;
        while(n>0){
            int digit = n%10;
            rev = digit + rev*10;
            n = n/10;
        }
        return rev;
    }
    public static void main(String[] args){
        int n = 010400;
        System.out.println("The reverse of the number is :" +isReverse(n));
    }
}
