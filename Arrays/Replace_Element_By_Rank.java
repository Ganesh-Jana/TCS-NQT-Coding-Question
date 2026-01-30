package Arrays;
import java.util.*;
public class Replace_Element_By_Rank {
    public static int[] replaceWithRank(int[] arr){
        int[] newArr = arr.clone();
        Arrays.sort(newArr);
        HashMap<Integer, Integer> map = new HashMap<>();
        int rank = 1;
        for(int num:newArr){
            if(!map.containsKey(num)){
                map.put(num, rank);
                rank++;
            }
        }
        int[] result = new int[arr.length];
        for(int i = 0; i<arr.length; i++){
            result[i] = map.get(arr[i]);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {20,15,26,2,98,6};
        System.out.println("Original Arrays:");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int[] num = replaceWithRank(arr);
        for(int i : num){
            System.out.print(i + " ");
        }
    }
}
