package Arrays;

import java.util.HashMap;
import java.util.Map;
public class Symmetric_Pair {
    public static void findSymmetricPairs(int[][] arr){
        Map<Integer, Integer> map = new HashMap<>();
        System.out.println("The Symmetric Pairs are: ");
        for(int i = 0; i<arr.length; i++){
            int first = arr[i][0];
            int second = arr[i][1];

            if(map.containsKey(first) && map.get(first) == second){
                System.out.print("("+first+" " + second+") ");
            }else{
                map.put(second,first);
            }
        }
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2},{2,1},{3,4},{4,5},{5,4}};
        findSymmetricPairs(arr);
    }
}
