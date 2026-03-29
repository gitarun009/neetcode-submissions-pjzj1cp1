class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int l=0;
        int r=n-1;
        int lmax=height[0];
        int rmax=height[n-1];

        int water=0;
        
        while(l<r){
            if(lmax<=rmax){
                l++;
                lmax=Math.max(lmax,height[l]);
                water+=lmax-height[l];
            }else{
                r--;
                rmax=Math.max(rmax,height[r]);
                water+=rmax-height[r];
            }
        }

        return water;
    }
}
