class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int[] merge= new int[m+n];

        int l1=0;
        int l2=0;
        int i=0;
        while(l1<n && l2<m){
            if(nums1[l1]<=nums2[l2]){
                merge[i]=nums1[l1];
                l1++;
                i++;
            }
            else{
                merge[i]=nums2[l2];
                l2++;
                i++;
            }
        }
        while(l1<n){
            merge[i]=nums1[l1];
            l1++;
            i++;            

        }
        while(l2<m){        
            merge[i]=nums2[l2];
            l2++;
            i++;
        }


        if(merge.length %2==0){
            return (merge[merge.length/2]+merge[merge.length/2-1])/2.0;
        }
        return merge[merge.length/2];
    }
}
