package Story_Based_Question;
import java.util.*;
public class Stock_Exchange_Problem_13 {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
           arr[i] = sc.nextInt();
        }
        int[] result = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i = n-1; i>=0; i--) {
            while(!st.isEmpty() && st.peek()<=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                result[i] = -1;
            }else{
                result[i] = st.peek();
            }
            st.push(arr[i]);
        }
        for(int i : result){
            System.out.print(i + " ");
        }
    }
}
