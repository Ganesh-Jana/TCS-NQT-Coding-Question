package String;
import java.util.*;
// ** Problem Statement: Given a string, write a program to change every letter
// in the given string with the letter following it in the alphabet (ie. a becomes b, p becomes q, z becomes a)
public class lexicographic_alphabet {
    public static String alphabet(String str){
        StringBuilder st = new StringBuilder();
        for(char ch : str.toCharArray()){
            if(ch == 'z'){
                st.append('a');
            }else if(ch == 'Z'){
                st.append('A');
            }else if(Character.isLetter(ch)){
                st.append((char)(ch+1));
            }else{
                st.append(ch);
            }
        }
        return st.toString();
    }
    public static void main(String[] args){
        System.out.println("Enter the String: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(alphabet(str));
    }
}
