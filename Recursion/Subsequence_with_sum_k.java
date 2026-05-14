package Recursion;
import java.util.*;
class soultion1{
   public List<List<Integer>>sumk(int[] arr, int k){
       List<List<Integer>> ans = new ArrayList<>();
       solve1(0, 0, arr, k, ans, new ArrayList<>());
       return ans;
   }
   void solve1(int index, int sum, int[] arr, int k, List<List<Integer>> ans, List<Integer>ds){
       if(index == arr.length){
            if(sum == k) {
                ans.add(new ArrayList<>(ds));
            }
           return;
       }
       ds.add(arr[index]);
       sum += arr[index];
       solve1(index+1, sum, arr, k, ans, ds);

       ds.remove(ds.size() -1);
       sum -= arr[index];
       solve1(index+1, sum, arr, k, ans, ds);
   }
}
public class Subsequence_with_sum_k {
    public static void main(String[] args) {
        int[] arr = {1,2,1};
        int k = 2;
        soultion1 s2 = new soultion1();
        List<List<Integer>> result = s2.sumk(arr, k);
        for(List<Integer> i : result){
            System.out.println(i + " ");
        }
    }
}
