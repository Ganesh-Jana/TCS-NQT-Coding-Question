package Arrays;
import java.util.HashMap;
import java.util.*;

public class Sort_Element_By_Frequency {
    public static int[] sortElement(int[] arr){
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num:arr){
            map.put(num, map.getOrDefault(num,0) + 1);
        }
        List<Integer> list = new ArrayList<>();
        for(int num:arr){
            list.add(num);
        }
        Collections.sort(list,(a,b)->{
             if(!map.get(a).equals(map.get(b))) return map.get(b)-map.get(a);
             return a-b;
        });
        for(int i = 0; i<n; i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {-199,6,7,-199,3,5};
        int[] num = sortElement(arr);
        for(int i : num){
            System.out.print(i + " ");
        }
    }
}
