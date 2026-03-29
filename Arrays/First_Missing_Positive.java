package Arrays;
import java.util.*;
public class First_Missing_Positive {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        String[] words = str.trim().split(" ");
        int n = words.length;
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = Integer.parseInt(words[i]);
        }

        for(int i = 0; i<n; i++){
            while(arr[i]>0 && arr[i]<=n && arr[arr[i]-1] != arr[i]){
                int temp = arr[i];
                arr[i] = arr[temp-1];
                arr[temp-1] = temp;
            }
        }
        for(int i = 0; i<n; i++){
            if(arr[i] != i+1){
                System.out.println(i+1);
                return;
            }
        }
        System.out.println(n+1);
    }
}
