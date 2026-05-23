package Stack;
import java.util.*;
public class Daily_Temperature {
    public static int[] temperature(int [] arr){
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i = n-1; i>=0; i--){
            while(!stack.isEmpty() && arr[stack.peek()] <= arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                ans[i] = 0;
            }else{
                ans[i] = stack.peek() - i;
            }
            stack.push(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] result = temperature(arr);
        for(int i : result){
            System.out.print(i+ " ");
        }
    }
}
