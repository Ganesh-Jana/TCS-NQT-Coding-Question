package Story_Based_Question;
import java.util.*;
public class Dutch_National_Flag {
    public static void swap(ArrayList<Integer> list, int i, int j){
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] nums = str.split(",");
        ArrayList<Integer> list = new ArrayList<>();
        for(String num : nums){
            list.add(Integer.parseInt(num.trim()));
        }
        int low = 0, mid = 0, high = list.size()-1;
        while(mid<=high){
            if(list.get(mid) == 0){
                swap(list, low, mid);
                low++;
                mid++;
            }else if(list.get(mid) == 1){
                mid++;
            }else{
                swap(list, mid, high);
                high--;
            }
        }
        for(int list1 : list){
            System.out.print(list1+ " ");
        }
    }
}
