package String;

public class NonRepeating_Character {
    public static void nonRepeating(String str){
        int[] freq = new int[26];
        for(char ch:str.toCharArray()){
            freq[ch-'a']++;
        }
        for(char c:str.toCharArray()){
            if(freq[c-'a'] == 1){
                System.out.print(c+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String str = "google";
        String str2 = "yahoo";
        nonRepeating(str2);
        nonRepeating(str);
    }
}
