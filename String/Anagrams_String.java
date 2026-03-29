package String;
import java.util.HashSet;
import java.util.Set;
public class Anagrams_String {
    public static boolean isAnagrams(String str1, String str2){
        if(str1.length() != str2.length()) return false;
        Set<Character> st = new HashSet<>();
        for(char ch:str1.toCharArray()){
            st.add(ch);
        }
        for(char ch2 : str2.toCharArray()){
            if(!st.contains(ch2)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String str1 = "CAT", str2 = "ACT";
        System.out.println(isAnagrams(str1,str2));
        String st = "RULES", st1 = "LESRT";
        System.out.println(isAnagrams(st,st1));
    }
}
