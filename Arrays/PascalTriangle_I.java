package Arrays;
import java.util.*;
public class PascalTriangle_I {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(result(r - 1, c - 1));
    }
    public static long result(int n, int r){
        long res = 1;
        for(int i = 0; i<r; i++){
            res = res*(n-i);
            res /= i+1;
        }
        return res;
    }
}
