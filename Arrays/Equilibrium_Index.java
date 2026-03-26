package Arrays;
public class Equilibrium_Index {
    public static void main(String[] args) {
        int[] arr = {1,-1,4};
        System.out.println(equilibriumIndex(arr));
    }
    public static int equilibriumIndex(int[] arr){
        int n = arr.length;
        int totalSum = 0, leftSum = 0, rightSum = 0;
        for(int i = 0; i<n; i++){
            totalSum += arr[i];
        }
        rightSum = totalSum;
        for(int i = 0; i<n; i++){
            rightSum -= arr[i];
            if(leftSum == rightSum){
                return i;
            }
            leftSum += arr[i];
        }
        return -1;
    }
}
