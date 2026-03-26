package Arrays;
import java.util.*;
public class Rearrange_Array_Element_By_Array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] words = str.split(" ");
        ArrayList<Integer> list = new ArrayList<>();
        for(String word:words){
            list.add(Integer.parseInt(word.trim()));
        }
        int n = list.size();
        int[] arr = new int[n];
        int pos = 0;
        int neg = 1;
        for(int i = 0; i<n; i++){
            if(list.get(i)>0){
                arr[pos] = list.get(i);
                pos += 2;
            }else{
                arr[neg] = list.get(i);
                neg += 2;
            }
        }
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
