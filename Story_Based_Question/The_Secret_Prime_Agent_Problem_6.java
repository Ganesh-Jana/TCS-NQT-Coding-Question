package Story_Based_Question;
import java.util.*;
public class The_Secret_Prime_Agent_Problem_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isPrime(n)){
            System.out.println("Secure");
        }else {
            System.out.println("Not Secure");
        }
    }
    public static boolean isPrime(int n){
        if(n<=1) return false;
        if(n == 2) return true;
        if(n%2 == 0) return false;
        for(int i = 3; i*i<=n; i+=2){
            if(n%i == 0) return false;
        }
        return true;
    }
}
