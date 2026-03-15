package Story_Based_Question;
import java.util.Scanner;
public class Video_Game_Character_Problem_14 {
    public static int minJump(int[] arr){
        int n = arr.length;
        if(n <= 1) return 0;
        if(arr[0] == 0) return -1;

        int jump = 1;
        int step = arr[0];
        int maxReach = arr[0];
        for(int i = 1; i<n; i++){
             if(i == n-1){
                 return jump;
             }
             maxReach = Math.max(maxReach, i+arr[i]);
             step--;
             if(step == 0){
                 jump++;
                 if(i>=maxReach){
                     return -1;
                 }
                 step = maxReach-i;
             }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(minJump(arr));
    }
}