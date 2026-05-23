package Stack;
import java.util.*;
public class Next_Greater_Element {
    public static int[] newGreater(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i = n-1; i>=0; i--){
            while (!stack.isEmpty() && stack.peek()<=arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                ans[i] = -1;
            }else {
                ans[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        return ans;
    }
    public static void main(String[] args) {

        int[] arr = {3, 1, 5, 2, 1, 0, 7, 9, 2, 3};
        int[] result = newGreater(arr);

        for(int i : result){
            System.out.print(i+ " ");
        }
    }
}
