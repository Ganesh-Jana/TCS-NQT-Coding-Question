package Arrays;

import java.util.*;

public class Remove_Duplicates_Unsorted_Array {
    public static List<Integer> removeDuplicate(int[] arr){
        int n = arr.length;
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i<n; i++){
            if(!set.contains(arr[i])){
                set.add(arr[i]);
                list.add(arr[i]);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 2, 3, 5, 6,8, 9, 2,4,5};
        List<Integer> list = removeDuplicate(arr);
        for(int num:list){
            System.out.print(num + " ");
        }
    }
}
