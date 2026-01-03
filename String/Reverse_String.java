package String;

public class Reverse_String {
    public static String reverse(String st){
        char[] words = st.toCharArray();
        int left = 0, right = words.length-1;
        while(left<right){
            char temp = words[left];
            words[left] = words[right];
            words[right] = temp;
            left++; right--;
        }
        return new String(words);
    }
    public static void main(String[] args) {
        String st = "I am iron man";
        String st1 = "Ganesh";
        System.out.println(reverse(st1));
        System.out.println(reverse(st));
    }
}
