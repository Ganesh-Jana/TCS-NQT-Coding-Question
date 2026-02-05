package Numbers;

public class prime {
    static boolean isPrime(int n){
        if(n<=1) return false;
        if(n == 2) return true;
        if(n%2 == 0) return false;
        for(int i = 3; i*i<=n; i+=2){
            if(n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int min = 10, max = 100;
        for(int i = min; i<=max; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }
}
