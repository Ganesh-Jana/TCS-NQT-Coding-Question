package Arrays;
public class Second_Largest_Second_Smallest {

    public static int secondLargest(int[] arr, int n){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++){
            if(arr[i]>largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
    public static int secondSmallest(int[] arr, int n){
        int smallest = Integer.MAX_VALUE;
        int second_smallest = Integer.MAX_VALUE;
        for(int i = 0; i<n; i++){
            if(arr[i]<smallest){
                second_smallest = smallest;
                smallest = arr[i];
            }else if(arr[i]<second_smallest && arr[i] != smallest){
                second_smallest = arr[i];
            }
        }
        return second_smallest;
    }
    public static void result(int[] arr, int n){
        System.out.println("The second Largest value is : "+secondLargest(arr, n));
        System.out.println("The second Smallest value is : "+secondSmallest(arr, n));
    }
    public static void main(String[] args) {
        int[] arr = {10, 5, 8};
        int n = arr.length;
        result(arr, n);
    }
}
