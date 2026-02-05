package Numbers;

public class Prime_factor {
    public static void primeFactor(int n){
        System.out.print("prime factor are :");
        if(n % 2 == 0){
            System.out.print(2 + " ");
            while(n % 2 == 0){
                n = n/2;
            }
        }
        for(int i = 3; i<=Math.sqrt(n); i++){
            if(n % i == 0){
                System.out.print(i + " ");
                while(n % i == 0){
                    n = n/i;
                }
            }
        }
        if(n>1){
            System.out.print(n);
        }
    }
    public static void main(String[] args) {
        int n = 60;
        primeFactor(n);
    }
}
