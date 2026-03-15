package Story_Based_Question;
import java.util.*;
public class Network_Analyst_Problem_12 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int[] arr = new int[n];
       for(int i = 0; i<n; i++){
           arr[i] = sc.nextInt();
       }
       for(int i = 0; i<n; i++){
           if(arr[i] == 0){
               arr[i] = -1;
           }
       }
       HashMap<Integer, Integer> map = new HashMap<>();
       int len = 0;
       int sum = 0;
       for(int i = 0; i<n; i++){
           sum += arr[i];
           if(sum == 0){
               len = i+1;
           }
           if(map.containsKey(sum)){
               len = Math.max(len, i - map.get(sum));
           }else{
               map.put(sum, i);
           }

       }
        System.out.println(len);
    }
}
