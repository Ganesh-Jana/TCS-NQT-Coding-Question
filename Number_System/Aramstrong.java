package Number_System;

public class Aramstrong {
    static boolean isAramstrong(int n){
        int org = n, new_val = 0;
        while(n>0){
            int digit = n%10;
            new_val = new_val + (digit*digit*digit);
            n = n/10;
        }
        if(org == new_val) return true;
        return false;
    }
    public static void main(String[] args) {
        int n = 111;
        System.out.println(isAramstrong(n));
    }
}
