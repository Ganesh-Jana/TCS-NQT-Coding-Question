package Arrays;
import java.util.*;
import java.util.HashMap;

public class Find_Repeating_Element{
    public static List<Integer> findRepeating(int[] arr){
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int num : arr){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer, Integer> set : map.entrySet()){
            if(set.getValue()>1){
                list.add(set.getKey());
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,2,3,5, 2, 1,4,4,5};
        List<Integer> list= findRepeating(arr);
        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}
