package String;
public class Max_Occuring_Character {
    public static String removeDuplicates(String str){
        StringBuilder st = new StringBuilder();
        boolean[] seen = new boolean[26];
        for(char ch: str.toCharArray()){
            if(!seen[ch-'a']){
                seen[ch-'a'] = true;
                st.append(ch);
            }
        }
        return st.toString();
    }
    public static String maxOccuring(String str){
        String str1 = "";
        int[] st = new int[26];
        for(char ch:str.toCharArray()){
            st[ch-'a']++;
        }
        int max = Integer.MIN_VALUE;
        for(char ch1 : str.toCharArray()){
            if(st[ch1 - 'a']>max){
                max = st[ch1-'a'];
            }
        }
        for(char ch2 : str.toCharArray()){
            if(st[ch2 - 'a'] == max){
                str1+=ch2;
                break;
            }
        }
        return str1;
    }
    public static void main(String[] args) {
        String str3 = "cbacdcbc";
        System.out.println(maxOccuring(str3));
        System.out.println(removeDuplicates(str3));
    }
}
