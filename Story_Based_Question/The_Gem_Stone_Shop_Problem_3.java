package Story_Based_Question;
import java.util.*;
public class The_Gem_Stone_Shop_Problem_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(result(arr));
    }
    public static int result(int[] arr){
        int n = arr.length;
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i<n; i++){
            set.add(arr[i]);
        }
        return set.size();
    }
}
