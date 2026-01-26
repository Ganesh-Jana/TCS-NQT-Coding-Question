package Arrays;
import java.util.Scanner;
public class Remove_Duplicate_Sorted_Array {
    public static int removeDuplicate(int[] arr){
        int n = arr.length;
        int index = 0;
        for(int j = 1; j<n;j++){
            if(arr[index] != arr[j]){
                index++;
                arr[index] = arr[j];
            }
        }
        return index+1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The size of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Array element: ");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
       int k =  removeDuplicate(arr);
        System.out.println("Length is : " +k);
        System.out.println("Result are: ");
        for(int x = 0; x<k; x++){
            System.out.print(arr[x] + " ");
        }
    }
}
