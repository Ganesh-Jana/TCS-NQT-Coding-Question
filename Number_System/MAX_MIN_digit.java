package Number_System;

public class MAX_MIN_digit {
    public static void main(String[] args) {
        int n = 12345670;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        while(n>0){
            int digit = n%10;
            if(digit<min) min = digit;
            if(digit>max) max = digit;
            n/=10;
        }
        System.out.println("The min is: "+min +" and max is: "+max);
    }
}
