package Story_Based_Question;
import java.util.*;

public class The_CyberSecurity_Analyst_Problem_7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int[] freq = new int[26];
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch>='a' && ch<='z'){
                freq[ch - 'a']++;
            }
        }

        List<Character> letters = new ArrayList<>();
        for(int i = 0; i<26; i++){
            letters.add((char)(i+'a'));
        }
        Collections.sort(letters, (a,b)->{
            if(freq[b-'a'] != freq[a-'a']) {
                return freq[b - 'a'] - freq[a - 'a'];
            }
            return a - b;
        });

        char first = letters.get(0);
        char second = letters.get(1);
        char third = letters.get(2);
        System.out.println("Mapping :"+ first + " -> e "+ second +" ->t "+third+" -> a " );
        StringBuilder st = new StringBuilder();
        for(int i = 0; i<str.length(); i++){
            char c = str.charAt(i);
            if(c == first){
                st.append('e');
            }else if(c == second){
                st.append('t');
            }else if(c == third){
                st.append('a');
            }else{
                st.append(c);
            }
        }
        System.out.println(st.toString());
    }
}
