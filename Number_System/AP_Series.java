package Number_System;
public class AP_Series {
    static double AP(int n, int a, int d){
        return  (n/2.0)*(2.0 * a + (n-1) * d);
    }
    public static void main(String[] args) {
        int n = 4, a = 2, d = 2;
        System.out.println(AP(n, a, d));
    }
}
