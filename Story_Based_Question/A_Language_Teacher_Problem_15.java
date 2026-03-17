package Story_Based_Question;
import java.util.*;
public class A_Language_Teacher_Problem_15 {
    public static String reverse(String str){
        char[] ch = str.toCharArray();
        int low = 0, high = ch.length-1;
        while(low<high){
            char temp = ch[low];
            ch[low] = ch[high];
            ch[high] = temp;
            low++;
            high--;
        }
        return new String(ch);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
//        String[] words = str.trim().split("\\s");

//        for(int i = words.length-1; i>=0; i--){
//            System.out.print(words[i]);
//            if(i != 0){
//                System.out.print(" ");
//            }
//        }
        System.out.println(reverse(str));

    }
}
