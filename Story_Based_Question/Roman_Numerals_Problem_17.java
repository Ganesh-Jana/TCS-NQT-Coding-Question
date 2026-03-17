package Story_Based_Question;
import java.util.*;
public class Roman_Numerals_Problem_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L",
                "XL", "X", "IX", "V", "IV", "I"};

        String result = "";
        for(int i = 0; i<values.length; i++){
            while(n>=values[i]){
                result += symbols[i];
                n -= values[i];
            }
        }
        System.out.println(result);
    }
}
