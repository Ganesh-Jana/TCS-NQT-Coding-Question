package Story_Based_Question;
import java.util.*;
public class A_Data_Scientist_Probelm_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int[] result = new int[n];
        result[0] = 1;   // Prefix Product
        for(int i = 1; i<n; i++){
            result[i] = arr[i-1]*result[i-1];
        }
        int suffix = 1;
        for(int i = n-1; i>=0; i--){
            result[i] = result[i]*suffix;
            suffix*=arr[i];
        }
        for(int i = 0; i<n; i++){
            System.out.print(result[i]+" ");
        }
    }
}
