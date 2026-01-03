package String;

public class Remove_Char_From_First_String {
    public static String removeChar(String str1, String str2){
        StringBuilder st = new StringBuilder();
        boolean[] seen = new boolean[26];
        for(char ch: str2.toCharArray()){
            seen[ch - 'a'] = true;
        }
        return st.toString();
    }
    public static void main(String[] args) {
        String str1 = "abcdef", str2 = "cefz";
        System.out.println(removeChar(str1, str2));
    }
}
