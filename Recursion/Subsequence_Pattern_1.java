package Recursion;
import java.util.*;

class solution{
    public List<List<Integer>> subsets(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        printsubsequence(0, new ArrayList<>(), ans, arr);
        return ans;
    }

    void printsubsequence(int index, List<Integer> ds, List<List<Integer>> ans, int[] arr) {
        if (index == arr.length) {
            ans.add(new ArrayList<>(ds));
            return;
        }
        ds.add(arr[index]);
        // Take Element
        printsubsequence(index + 1, ds,ans, arr);

        // Backtrack
        ds.remove(ds.size() - 1);

        // Don't Take Element
        printsubsequence(index + 1, ds,ans, arr);
    }
}

public class Subsequence_Pattern_1 {
    public static void main(String[] args) {
        solution s1 = new solution();
        int[] arr = {1, 2, 3};
        List<List<Integer>> result = s1.subsets(arr);
        for (List<Integer> i : result) {
            System.out.print(i + " ");
        }
    }
}
