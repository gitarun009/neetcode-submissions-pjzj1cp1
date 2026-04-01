class Solution {
    public int rob(int[] nums) {
        int[]dp= new int[nums.length];
        return helper(0,nums,dp);
    }
    public int helper(int i, int[]nums, int[]dp){
        if(i>=nums.length){
            return 0;
        }
        if(dp[i]!=0)return dp[i];
        int rob= nums[i]+helper(i+2,nums,dp);
        int skip = helper(i+1, nums,dp);

        return dp[i]=Math.max(rob,skip);
    }
}
