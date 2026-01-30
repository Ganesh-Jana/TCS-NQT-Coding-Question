package Arrays;

public class Rotate_Array_K {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 2;
        rotateArray(arr, k);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
    public static void rotateArray(int[] arr, int k){
        int n = arr.length;
        k = k%n;
        if(k == 0) return;
        reverse(arr, 0, n-k-1);
        reverse(arr, n-k, n-1);
        reverse(arr, 0, n-1);

    }
    public static void reverse(int[] arr, int left, int right){
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++; right--;
        }

    }
}
