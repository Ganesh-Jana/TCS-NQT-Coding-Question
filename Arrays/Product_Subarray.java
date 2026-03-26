package Arrays;
import java.util.*;
public class Product_Subarray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(str.startsWith("[") && str.endsWith("]")){
            str = str.substring(1, str.length()-1);
        }
        String[] nums = str.split(",");
        ArrayList<Integer> list = new ArrayList<>();
        for(String num : nums){
            list.add(Integer.parseInt(num.trim()));
        }
        int pre = 1, suff = 1;
        int maxSubarray = 1;
        for(int i = 0; i<list.size(); i++){
            if(pre == 0) pre = 1;
            if(suff == 0) suff = 1;

            pre *= list.get(i);
            suff *= list.get(list.size()-i-1);
            maxSubarray = Math.max(maxSubarray, Math.max(pre, suff));
        }
        System.out.print(maxSubarray);
    }
}
