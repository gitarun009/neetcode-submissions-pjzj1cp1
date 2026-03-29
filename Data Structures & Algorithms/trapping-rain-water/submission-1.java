class Solution {
    public int trap(int[] height) {
        int[] prev=new int[height.length];
        int[] next= new int[height.length];

        prev[0]=height[0];
        next[height.length-1]=height[height.length-1];

        for(int i=1;i<height.length;i++){
            prev[i]=Math.max(prev[i-1],height[i]);
        }

        for(int i=height.length-2;i>=0;i--){
            next[i]=Math.max(next[i+1],height[i]);
        }

        int water=0;
        for(int i=0;i<height.length;i++){
            water+=Math.min(next[i],prev[i])-height[i];
        }
        return water;
    }
}
