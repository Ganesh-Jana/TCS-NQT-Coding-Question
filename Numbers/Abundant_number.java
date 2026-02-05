package Numbers;
/* Example 1:
        Input: 18
        Output: Abundant Number
        Explanation: Divisors of 18 are 1,2,3,6,9. 1+2+3+6+9=21, Since 21 is greater than 18, 18 is an abundant
         number.
 */
public class Abundant_number {
    public static int factorSum(int n){
        int sum = 0;
        for(int i = 1; i<=Math.sqrt(n); i++){
            if(n%i == 0){
                sum += i;
                int pair = n/i;
                if(pair != i && pair != n){
                    sum += pair;
                }
            }
        }
        return sum;
    }
    public static boolean isAbundant(int n){
        if(factorSum(n)>n) return true;
        return false;
    }
    public static void main(String[] args) {
        int n = 18;
        System.out.println(isAbundant(n));
        int n1 = 21;
        System.out.println(isAbundant(n1));
        int n2 = 36;
        System.out.println(isAbundant(n2));
    }
}
