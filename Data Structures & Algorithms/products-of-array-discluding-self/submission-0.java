class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[]leftPro= new int[nums.length];
        int[]rightPro=new int[nums.length];

        leftPro[0]=1;
        rightPro[nums.length-1]=1;

        for(int i=1;i<nums.length;i++){
            leftPro[i]=leftPro[i-1]*nums[i-1];
        }
        for(int i=nums.length-2;i>=0;i--){
            rightPro[i]=rightPro[i+1]*nums[i+1];
        }

        int[] res= new int[nums.length];
        for(int i=0;i<nums.length;i++){
            res[i]=leftPro[i]*rightPro[i];
        }
        return res;
    }
}  
