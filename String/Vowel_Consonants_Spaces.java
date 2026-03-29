package String;

public class Vowel_Consonants_Spaces {
    public static void count(String str){
        int vowel = 0, consonants = 0, spaces = 0;
        str = str.toLowerCase();
        for(int i = 0; i<str.length();i++){
           if(str.charAt(i) == 'a' || str.charAt(i) == 'e'||
                   str.charAt(i) == 'i'||str.charAt(i) == 'o'||str.charAt(i) == 'u'){
               vowel++;
           }else if(str.charAt(i) >='a' && str.charAt(i)<='z'){
               consonants++;
           }else if(str.charAt(i) == ' '){
               spaces++;
           }
        }
        System.out.println("vowel :"+vowel+" consonants :"+consonants+" spaces :"+spaces);
    }
    public static void main(String[] args) {
        String str = "Take u forward is Awesome";
        count(str);
        String str1 = "India won the cricket match";
        count(str1);
    }
}
