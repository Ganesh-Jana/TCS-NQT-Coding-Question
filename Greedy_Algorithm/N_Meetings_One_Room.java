package Greedy_Algorithm;
import java.util.*;
public class N_Meetings_One_Room {
    public static List<Integer> nMeetings(int[] start, int[] end){
        List<int[]> meetings = new ArrayList<>();
        for(int i = 0; i<start.length; i++) {
            meetings.add(new int[]{end[i], start[i], i+1});
        }
        Collections.sort(meetings, (a,b)-> a[0] - b[0]);

        List<Integer> result = new ArrayList<>();
        int lastEnd = -1;
        for(int[] m : meetings){
            if(m[1] > lastEnd){
                result.add(m[2]);
                lastEnd = m[0];
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] start = {0,3,1,5,5,8};
        int[] end = {5,4,2,9,7,9};
        List<Integer> result = nMeetings(start, end);
        for(int i : result){
            System.out.print(i + " ");
        }
    }
}
