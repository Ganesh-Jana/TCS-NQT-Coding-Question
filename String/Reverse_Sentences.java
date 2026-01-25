package String;

public class Reverse_Sentences {
    public static void main(String[] args) {
        String str = "welcome to the jungle";
        System.out.println(reverse(str));
    }
    public static String reverse(String str){
        String[] words = str.trim().split("\\s+");
        StringBuilder st = new StringBuilder();
        for(int i = words.length-1;i>=0; i--){
            st.append(words[i]);
            if(i != 0){
                st.append(" ");
            }
        }
        return st.toString();
    }
}
