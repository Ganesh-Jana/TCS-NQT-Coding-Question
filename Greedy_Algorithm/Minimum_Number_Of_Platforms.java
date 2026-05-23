package Greedy_Algorithm;
import java.util.*;
public class Minimum_Number_Of_Platforms {
    public static int findPlatform(int[] arr, int[] dep){
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i = 0, j = 0;
        int platform = 0, maxPlatform = 0;
        while(i<arr.length){
            if(arr[i] <= dep[j]){
                platform++;
                i++;
            }else{
                platform--;
                j++;
            }
            maxPlatform = Math.max(maxPlatform, platform);
        }
        return maxPlatform;
    }
    public static void main(String[] args) {
        int [] arr = {900, 945, 955, 1100, 1500, 1800};
        int[] dep = {920, 1200, 1130, 1150, 1900, 2000};
        System.out.println(findPlatform(arr, dep));
    }
}
