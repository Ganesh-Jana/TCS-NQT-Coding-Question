package Arrays;
import java.util.*;
public class Next_Permutation {
    public static void reverse(int[] arr, int low, int high){
        while(low<high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] word = str.split(" ");
        int n = word.length;
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = Integer.parseInt(word[i]);
        }
        int index = -1;
        for(int i = n-2; i>=0; i--){
            if(arr[i]<arr[i+1]){
                index = i;
                break;
            }
        }
        if(index == -1){
            reverse(arr, 0, n-1);
            for(int i : arr){
                System.out.print(i+" ");
            }
            return;
        }
        for(int i = n-1; i>index; i--){
            if(arr[i]>arr[index]){
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                break;
            }

        }
        reverse(arr, index+1, n-1);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
