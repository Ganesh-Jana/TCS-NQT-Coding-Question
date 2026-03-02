package Story_Based_Question;
import java.util.*;
public class The_Library_Book_Return_Problem_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long totalSum = n * (n+1)/2;
        long sum = 0;
        for(int i = 0; i<n-1; i++){
            sum += sc.nextLong();
        }
        long missing = totalSum - sum;
        System.out.println(missing);
    }
}
