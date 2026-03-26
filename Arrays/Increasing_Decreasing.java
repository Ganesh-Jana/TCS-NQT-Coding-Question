package Arrays;
import java.util.*;
public class Increasing_Decreasing {
    public static void increaing_decreasing(int[] arr){
        int n = arr.length;
        Arrays.sort(arr);
        int low = n/2; int high = n-1;
        while(low<high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++; high--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {8,7,1,6,5,9};
        increaing_decreasing(arr);
        for(int num : arr){
            System.out.print(num+ " ");
        }
    }
}
