package Arrays;
import java.util.HashMap;
import java.util.*;
public class Freq_Count {
    public static void freqCount(int[] arr){
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for(Map.Entry<Integer, Integer> set : map.entrySet()){
            System.out.println(set.getKey() + " " + set.getValue());
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,5,3,1,2,3,4,5,2,1,5,4,2,3};
        freqCount(arr);
    }
}
