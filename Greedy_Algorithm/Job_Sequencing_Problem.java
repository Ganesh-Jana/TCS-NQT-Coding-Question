package Greedy_Algorithm;
import java.util.*;
public class Job_Sequencing_Problem {
    static class Job{
        int id;
        int deadline;
        int profit;
        Job(int id, int deadline, int profit){
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Job[] jobs = new Job[n];
        for(int i = 0; i<n; i++){
            int id = sc.nextInt();
            int deadline = sc.nextInt();
            int profit = sc.nextInt();
            jobs[i] = new Job(id, deadline, profit);
        }
        Arrays.sort(jobs, (a,b) -> b.profit - a.profit);

        int maxDeadline = 0;
        for(Job job : jobs){
            maxDeadline = Math.max(maxDeadline, job.deadline);
        }
        int[] slot = new int[maxDeadline + 1];
        Arrays.fill(slot, -1);
        int countJobs = 0;
        int maxProfit = 0;

        for(int i = 0; i<n; i++){
            for(int j = jobs[i].deadline; j>0; j--){
                if(slot[j] == -1){
                    slot[j] = jobs[i].id;
                    countJobs++;
                    maxProfit += jobs[i].profit;
                    break;
                }
            }
        }
        System.out.println(countJobs + " " + maxProfit);
    }
}
