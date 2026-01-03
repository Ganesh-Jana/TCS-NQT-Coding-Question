package String;

import java.util.Arrays;

public class Capitalize_First_Last_Letter {
    public static String capitalize(String str){
        String[] words = str.split("\\s+");
        StringBuilder st = new StringBuilder();
        for(String word:words){
            if(word.length() == 1){
                st.append(word.toUpperCase());
            }else{
                st.append(
                     Character.toUpperCase(word.charAt(0))+
                             word.substring(1,word.length()-1)+
                             Character.toUpperCase(word.charAt(word.length()-1))
                );
            }
            st.append(" ");
        }

        return st.toString().trim();
    }
    public static void main(String[] args) {
        String str = "Ganesh is a awesome boy";
        System.out.println(capitalize(str));
    }
}
