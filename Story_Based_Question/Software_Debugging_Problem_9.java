
package Story_Based_Question;
import java.util.*;
public class Software_Debugging_Problem_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int open = 0;
        int invalidClose = 0;
        for (char ch : str.toCharArray()) {
           if(ch == '('){
               open++;
           }else{
               if(open>0){
                   open--;
               }else{
                   invalidClose++;
               }
           }
        }
        int minInsertion = open+invalidClose;
        System.out.println("Unmatched malloc: "+open);
        System.out.println("Invalid Close: "+invalidClose);
        System.out.println("Min insertions to fix: "+minInsertion);
    }
}
