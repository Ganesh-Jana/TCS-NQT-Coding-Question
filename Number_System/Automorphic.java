package Number_System;

public class Automorphic {
    public static boolean isAutomorphic(int n){
        int value = n;
        int sqt = n*n;
        while(value>0){
            if(value%10 != sqt%10){
                return false;
            }
            value /= 10;
            sqt /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 124;
        System.out.println(isAutomorphic(n));
    }
}
