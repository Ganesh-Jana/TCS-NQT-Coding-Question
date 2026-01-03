package Number_System;

public class fibonacci {
    public static int fibonacci_series(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;
        return fibonacci_series(n-1)+fibonacci_series(n-2);
    }
    public static void main(String[] args) {
        int n = 10;
        for(int i = 0; i<=n; i++){
            System.out.print(fibonacci_series(i)+" ");
        }
    }
}
