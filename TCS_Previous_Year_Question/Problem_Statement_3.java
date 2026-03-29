package TCS_Previous_Year_Question;
import java.util.*;
public class Problem_Statement_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        char[] ch = new char[n];

        for(int i = 0; i < n; i++){
            ch[i] = sc.next().charAt(0);
        }

        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : ch){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        boolean found = false;

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() % 2 == 1){
                System.out.println(entry.getKey());
                found = true;
                break;
            }
        }

        if(!found){
            System.out.println("All are Even");
        }
    }
}