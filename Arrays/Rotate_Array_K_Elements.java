package Arrays;

public class Rotate_Array_K_Elements {
    public static void reverse(int[]arr,int low, int high){
        while(low<high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++; high--;
        }
    }
    public static void RoatateArray(int[] arr, int k){
        int n = arr.length;
        k = k%n;
        if(k == 0) return;
        reverse(arr, 0, k-1);
        reverse(arr,k,n-1);
        reverse(arr,0,n-1);
    }
    public static void rightRotate(int[]arr, int k){
        int n = arr.length;
        RoatateArray(arr, n - (k%n));
    }
    public static void main(String[] args) {
        int[] arr = {1,6,7,2,4,3,9,5};
        int k = 3;
        RoatateArray(arr,k);
        for(int num : arr){
            System.out.print(num+" ");
        }
        System.out.println();
        System.out.println("Right Rotate: ");
        rightRotate(arr,k);
        for(int num : arr){
            System.out.print(num+" ");
        }
    }
}
