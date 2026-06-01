package DP;
public class Frog_Jump {
    public static int frogJump(int[] height){
        int n = height.length;
        int[] dp = new int[n];
        if(n == 0) return 0;
        dp[0] = 0;
        for(int i = 1; i<n; i++){
            int jump1 = dp[i-1] + Math.abs(height[i] - height[i-1]);
            int jump2 = Integer.MAX_VALUE;
            if(i>1){
                jump2 = dp[i-2] + Math.abs(height[i] - height[i-2]);
            }
            dp[i] = Math.min(jump1, jump2);
        }
        return dp[n-1];
    }
    public static void main(String[] args) {
        int[] height = {7, 5, 1, 2, 6};
        System.out.println(frogJump(height));

    }
}
