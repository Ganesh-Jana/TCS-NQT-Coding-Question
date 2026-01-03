package String;
public class Frequency_of_String {
    public static void frequency(String str){
        int[] ch = new int[26];
        for(char c : str.toCharArray()){
            ch[c-'a']++;
        }
        for(int i = 0; i<26;i++){
            if(ch[i]>0){
                System.out.print((char)(i+'a')+""+ch[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        String str = "ganesh";
        frequency(str);
    }
}
