package Story_Based_Question;
import java.util.*;
public class CPU_Scheduler_Problem_10 {
    static class Task{
        int id, deadline, profit;
        Task(int id, int deadline, int profit){
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Task[] tasks= new Task[n];
        for(int i = 0; i<n; i++){
            int id = sc.nextInt();
            int deadline = sc.nextInt();
            int profit = sc.nextInt();
            tasks[i] = new Task(id, deadline, profit);
        }

        Arrays.sort(tasks, (a,b) -> b.profit-a.profit);

        int maxDeadline = 0;
        int maxProfit = 0;
        for(Task t:tasks){
            maxDeadline = Math.max(maxDeadline, t.deadline);
        }
        int[] slots = new int[maxDeadline+1];
        boolean[] occupied = new boolean[maxDeadline+1];

        for(Task t:tasks){
            for(int i = t.deadline; i>=1; i--){
                if(!occupied[i]){
                    occupied[i] = true;
                    slots[i]= t.id;
                    maxProfit += t.profit;
                    break;
                }
            }
        }
        System.out.println("Maximum profit:"+maxProfit);
        for(int i = 1; i<=maxDeadline; i++){
            if(occupied[i]){
                System.out.println(slots[i]+" ");
            }
        }
    }
}
