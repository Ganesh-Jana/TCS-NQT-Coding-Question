package String;
import java.util.Scanner;
public class Max_number_repeated_letters_string {
    public static String maxRepeatedLetters(String str){
        int n = str.length();
        String result = "-1";
        int globalMax = 1;
        String[] words = str.split("\\s+");

        for(String word : words){
            int[] freq = new int[26];
            int localMax = 1;

            for(char ch : word.toCharArray()){
                if(Character.isLetter(ch)){
                    freq[ch - 'a']++;
                    localMax = Math.max(localMax, freq[ch - 'a']);
                }
            }
            if(localMax>globalMax){
                globalMax = localMax;
                result = word;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Enter the String");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(maxRepeatedLetters(str));
    }
}
