package String;

import java.util.HashSet;
import java.util.Set;

public class Remove_Char_From_First_String {
    public static String removeChar(String str1, String str2){
        Set<Character> set = new HashSet<>();
        for(char ch : str2.toCharArray()){
            set.add(ch);
        }
        StringBuilder st = new StringBuilder();
        for(char ch1: str1.toCharArray()){
            if(!set.contains(ch1)){
                st.append(ch1);
            }
        }
        return st.toString();
    }
    public static void main(String[] args) {
        String str1 = "abcdef", str2 = "cefz";
        System.out.println(removeChar(str1, str2));
    }
}
