package Numbers;

public class Sum_of_digit {
    public static int sumDigit(int n){
        if(n == 0) return 0;
        return 1 + (n-1)%9;
    }

    public static void main(String[] args) {
        int n = 529;
        System.out.println("The sum of digit is: "+sumDigit(n));
    }
}
