package Matrix;
import java.util.*;
public class Count_Students_Marks_Greater_40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int count = 0;
        for(int i = 0; i<N; i++){
            boolean mark = true;
            for(int j = 0; j<M; j++){
                int marks = sc.nextInt();
                if(marks<40){
                    mark = false;
                }
            }
            if(mark) count++;
        }
        System.out.println(count);
    }
}
