package Number_System;

public class GP_Series {
    static double GP(int a, int r, int n){
        return (a * (Math.pow(r,n) - 1)) / (r-1);
    }

    public static void main(String[] args){
        int a = 3, r = 5, n = 2;
        System.out.println(GP(a, r, n));
    }
}
