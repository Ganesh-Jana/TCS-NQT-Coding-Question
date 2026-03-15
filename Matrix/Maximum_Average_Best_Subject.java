package Matrix;
import java.util.*;
public class Maximum_Average_Best_Subject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        double average = Integer.MIN_VALUE;
        int bestSubject = 0;
        for(int i = 0; i<N; i++){
            int sum = 0;
            for(int j = 0; j<M;j++){
                int marks = sc.nextInt();
                sum += marks;
            }
            double avg = (double)sum/M;
            if(avg>average){
                average = avg;
                bestSubject = i+1;
            }
        }
        System.out.println(bestSubject);
    }
}
