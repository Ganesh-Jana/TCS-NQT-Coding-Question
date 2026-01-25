package String;

import java.util.Scanner;

public class Count_Words_String {
    public static int countWords(String str){
        if(str == null || str.trim().isEmpty()){
            return 0;
        }
        String[] words = str.trim().split("\\s+");
        return words.length;
    }
    public static void main(String[] args) {
        System.out.println("Enter thr String: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(countWords(str));
    }
}
