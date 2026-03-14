package Story_Based_Question;
import java.util.*;
public class Cryptic_Number {

    public static boolean isPalindrome(int n){
        int rev = 0;
        int original = n;

        while(n>0){
            int digit = n % 10;
            rev = rev*10 + digit;
            n /=10;
        }
        return original == rev;
    }

    public static boolean hasRepeatDigit(int n){
        boolean[] seen = new boolean[10];
        while(n>0){
            int d = n%10;
            if(seen[d]){
                return true;
            }
            seen[d] = true;
            n /= 10;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int L = sc.nextInt();
            int R = sc.nextInt();
            boolean found = false;
            for (int i = L; i <= R; i++) {
                if (i % 7 == 0 && i % 5 != 0) {
                    if (!isPalindrome(i) && !hasRepeatDigit(i)) {
                        System.out.print(i + " ");
                        found = true;
                    }
                }
            }
            if (!found) {
                System.out.println(-1);
            }
        }
    }
}
