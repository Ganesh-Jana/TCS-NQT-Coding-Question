package String;
import java.util.*;
public class Problem_Statement1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int pos = 0,  neg = 0;
        int n = str.length();
        for(int i = 0; i<n; i++){
            if(str.charAt(i) == '*'){
                pos++;
            }else{
                neg++;
            }
        }
        if(pos== neg){
            System.out.print(0);
        }else if(pos>neg){
            System.out.print(pos-neg);
        }else{
            System.out.print(pos-neg);
        }

    }
}
