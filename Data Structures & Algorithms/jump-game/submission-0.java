class Solution {
    public boolean canJump(int[] nums) {
        int maxIdx=0;
        int curr=0;

        for(int i=0;i<nums.length;i++){
            if(i>maxIdx)return false;
            curr=i+nums[i];
            maxIdx=Math.max(curr,maxIdx);
        }
        return true;
    }
}
