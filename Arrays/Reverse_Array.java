package Arrays;

public class Reverse_Array {
    public static void reverse(int[] arr){
        int l = 0, h = arr.length-1;
        while(l<h){
            int temp = arr[l];
            arr[l] = arr[h];
            arr[h] = temp;
            l++; h--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        reverse(arr);
        for (int num : arr){
            System.out.print(num + " ");
        }
    }
}
