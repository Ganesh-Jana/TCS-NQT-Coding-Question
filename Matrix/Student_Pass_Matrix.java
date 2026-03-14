package Matrix;
import java.util.*;
public class Student_Pass_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();  // Number of student
        int M = sc.nextInt();  // Number of Subject;
        int result = 0;
        for(int i = 0; i<N; i++){
            int sum = 0;
            for(int j = 0; j<M; j++){
                int marks = sc.nextInt();
                sum += marks;
            }
            double average = (double) sum/M;
            if(average>50){
                result++;
            }
        }
        System.out.println(result);
    }
}
