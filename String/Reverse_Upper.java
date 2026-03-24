package String;
import java.util.*;
public class Reverse_Upper {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] words = str.split(" ");

        int n = words.length;
        StringBuilder st = new StringBuilder();
        int pos = 0;
        for(int i = n-1; i>=0; i--){
            String word = words[i];

           if(pos % 2 == 0){
               st.append(word.toLowerCase());
           }else {
               st.append(word.toUpperCase());
           }
            if(i != 0){
                st.append(" ");
            }
            pos++;
        }
        System.out.println(st);

    }
}
