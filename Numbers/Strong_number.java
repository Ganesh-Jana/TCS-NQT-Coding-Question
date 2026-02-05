package Numbers;

public class Strong_number {
    public static int factorial(int digit){
        int fact = 1;
        for(int i = 1; i<=digit; i++){
            fact = fact*i;
        }
        return fact;
    }

    public static boolean isStrong(int n){
        int sum = 0;
        int value = n;
        while(n>0){
            int digit = n%10;
            sum = sum + factorial(digit);
            n = n/10;
        }
        if(sum == value) return true;
        return false;
    }
    public static void main(String[] args) {
        int n = 145;
        System.out.println(isStrong(n));
    }
}
