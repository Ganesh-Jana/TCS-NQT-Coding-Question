package String;

public class Remove_Vowel {
    public static String removeVowel(String str){
        str = str.toLowerCase();
        String st = "";
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'||
                    str.charAt(i) == 'o' && str.charAt(i) == 'u' ){
                continue;
            }
            st += str.charAt(i);
        }
        return st;
    }
    public static String removeSpace(String str){
        str = str.replaceAll(" ","");
        return str;
    }
    public static String removeOddCharacter(String str){
        String st = "";
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
                st += ch;
        }
        return st;
    }
    public static void main(String[] args) {
        String str = "take U forward";
        String str1 = "Java&C++";
        System.out.println(removeVowel(str));
        System.out.println(removeSpace(str));
        System.out.println(removeOddCharacter(str1));
    }
}
