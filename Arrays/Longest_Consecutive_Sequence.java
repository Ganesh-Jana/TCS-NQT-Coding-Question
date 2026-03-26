package Arrays;
import java.util.*;
public class Longest_Consecutive_Sequence {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] words = str.split(",");
        ArrayList<Integer> list = new ArrayList<>();

        for(String word: words){
            list.add(Integer.parseInt(word.trim()));
        }
        int n = list.size();
        int longest = 1;
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i<n; i++){
            set.add(list.get(i));
        }
        for(int it : set){
            if(!set.contains(it-1)){
               int count = 1;
               int x = it;
               while(set.contains(x+1)){
                   x = x+1;
                   count += 1;
               }
               longest = Math.max(longest, count);
            }
        }
        System.out.println(longest);
    }
}
