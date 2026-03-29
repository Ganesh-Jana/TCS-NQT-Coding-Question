package TCS_Previous_Year_Question;
import java.util.*;
public class Problem_Statement_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] word = str.trim().split(" ");
        int n = word.length;
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = Integer.parseInt(word[i]);
        }
        int count = 1;
        int max = arr[0];
        for(int i = 1; i<n; i++){
            if(arr[i]>max){
                max = arr[i];
                count++;
            }
        }
        System.out.println(count);
    }
}
