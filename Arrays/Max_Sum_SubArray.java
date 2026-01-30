package Arrays;
public class Max_Sum_SubArray {
    public static int MaxSum(int[] arr){
        int sum = 0;
        int start = 0, ansStart = -1, ansEnd = -1;
        int maxsum = 0;
        for(int i = 0; i<arr.length; i++){
            sum += arr[i];
            if(sum>maxsum){
                maxsum = sum;
                ansStart = start;
                ansEnd = i;
            }
            if(sum<0){
                sum = 0;
                start = i+1;
            }
        }
        for(int j = ansStart; j<=ansEnd;j++){
            System.out.print(arr[j] + " ");
        }
        System.out.println();
        return maxsum;
    }
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(MaxSum(arr));
    }
}
