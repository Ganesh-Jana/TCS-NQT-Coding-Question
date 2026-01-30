package Arrays;

public class Max_Product_Subarray {
    public static int maxProduct(int[] num){
        int pref = 1, suff = 1;
        int ans = Integer.MIN_VALUE;
        int n = num.length;
        for(int i = 0; i<n; i++){
            if(pref == 0) pref = 1;
            if(suff == 0) suff = 1;

            pref *= num[i];
            suff *= num[n-i-1];
           ans = Math.max(ans, Math.max(pref, suff));
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] num1 = {1,2,3,4,5,0};
        int[] num2 = {1,2,-3,-5, 0,-4,-5};
        System.out.println(maxProduct(num1));
        System.out.println(maxProduct(num2));
    }
}
