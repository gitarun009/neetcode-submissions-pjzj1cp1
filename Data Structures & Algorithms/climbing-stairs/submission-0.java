class Solution {
    public int climbStairs(int n) {
        int[] dp= new int[n+1];
        return helper(n,0,dp);
    }
    public int helper(int n, int i, int[]dp){
        if(i==n)return 1;

        if(i>n)return 0;
        if(dp[i]!=0)return dp[i];
        return dp[i]= helper(n,i+1,dp)+helper(n,i+2,dp);
    }
}
