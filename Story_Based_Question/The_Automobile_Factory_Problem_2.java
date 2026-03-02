package Story_Based_Question;
import java.util.*;
public class The_Automobile_Factory_Problem_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int w = sc.nextInt();

        if(w % 2 != 0 || 2 * v > w || w > 4*v){
            System.out.println("Invalid Input");
        }else{
            int FW = (w-2*v)/2;
            int TW = v - FW;

            if(FW>=0 && TW>=0){
                System.out.println(FW);
                System.out.println(TW);
            }else {
                System.out.println("Invalid Input");
            }
        }
    }
}
