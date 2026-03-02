package Story_Based_Question;
import java.util.*;
public class The_Football_Team_Selection_Problem_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int sum = arr[0];
        int maxSum = arr[0];
        for(int i = 1; i<n; i++){

            sum = Math.max(arr[i], arr[i]+sum);

            maxSum = Math.max(maxSum, sum);
        }
        System.out.println(maxSum);
    }
}
