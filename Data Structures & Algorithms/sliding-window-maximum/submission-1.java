class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(k==1)return nums;
        
        int left=0;
        int right=0;
        int i=0;
        int max=Integer.MIN_VALUE;
        int []res= new int[nums.length-k+1];

        while(left<=nums.length-k){
            max=Math.max(max, nums[right]);
            if(right-left+1==k){
                res[i]=max;
                i++;
                left++;
                right=left;
                max=Integer.MIN_VALUE;
                continue;
            }
            right++;
        }
        return res;
    }
}
