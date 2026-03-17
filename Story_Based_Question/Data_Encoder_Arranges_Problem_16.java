package Story_Based_Question;
import java.util.*;
public class Data_Encoder_Arranges_Problem_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int r = sc.nextInt();
        if(r==1){
            System.out.println(str);
            return;
        }
        String result = "";
        int cycle = 2 * (r-1);
        for(int i = 0; i<r; i++){
            for(int j = i; j<str.length(); j += cycle){
                result += str.charAt(j);

                int second = j + cycle - 2*i;
                if(i != 0 && i != r-1 && second<str.length()){
                    result += str.charAt(second);
                }
            }
        }
        System.out.println(result);
    }
}
