package Greedy_Algorithm;
import java.util.*;
public class Fractional_Knapsack {
    static class Item{
        int value;
        int weight;
        double ratio;
        Item(int value, int weight){
            this.value = value;
            this.weight = weight;
            this.ratio = (double)value/weight;
        }
    }
    public static double fractionalKnapsack(int[] val, int[] wt, int capacity ){
            int n = val.length;
            Item[] items = new Item[n];
            for(int i = 0; i<n; i++){
                items[i] = new Item(val[i], wt[i]);
            }
            Arrays.sort(items, (a, b) -> Double.compare(b.ratio, a.ratio));

            double totalValue = 0.0;
            for(Item item : items){
                if(capacity>=item.weight){
                    totalValue += item.value;
                    capacity -= item.weight;
                }
                else {
                    totalValue += item.ratio * capacity;
                    break;
                }
            }
            return totalValue;
    }
    public static void main(String[] args) {
        int [] val = {60, 100, 120};
        int[] wt = {10, 20, 30};
        int capacity = 50;

        double maxValue = fractionalKnapsack(val, wt, capacity);
        System.out.println("Answer is :" + maxValue);
    }
}
