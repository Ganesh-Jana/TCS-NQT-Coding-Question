package Number_System;
//A number is harshad number if sum of individual number is divided by given number.
public class Harshad_Number {
    public static boolean isHarshad(int n){
        int sum = 0;
        int givenNumber = n;
        while(n>0){
            int digit = n%10;
            sum = sum+digit;
            n = n/10;
        }
        if(givenNumber%sum == 0) return true;
        else return false;
    }
    public static void main(String[] args) {
        int n = 379;
        System.out.println(isHarshad(n));
    }
}
