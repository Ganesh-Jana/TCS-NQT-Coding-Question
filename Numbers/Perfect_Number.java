package Numbers;

public class Perfect_Number {
    static boolean isPerfect(int n){
        int sum = 0;
        for(int i = 1; i<n-1; i++){
            if(n % i == 0){
                sum += i;
            }
        }
        return sum == n ?true:false;
    }
    public static void main(String[] args) {
        int min = 1, max = 100;
        for(int i = min; i<=max; i++){
            if(isPerfect(i)){
                System.out.print(i+ " ");
            }
        }
    }
}
