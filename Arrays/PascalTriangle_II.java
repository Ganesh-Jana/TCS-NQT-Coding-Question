package Arrays;
import java.util.*;
public class PascalTriangle_II {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 1; i<=n; i++){
            list.add(result(i));
        }
        System.out.println(list);
    }
    public static List<Integer> result(int n){
        List<Integer> lt = new ArrayList<>();
        int num = 1;
        lt.add(num);
        for(int i = 1; i<n; i++){
            num = num * (n-i);
            num /= i;
            lt.add(num);
        }
        return lt;
    }
}
