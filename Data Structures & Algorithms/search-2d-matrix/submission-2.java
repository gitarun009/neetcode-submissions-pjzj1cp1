class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int n=matrix.length;
        int m=matrix[0].length;
        int row=-1;
        for(int i=0;i<n;i++){
           if(target==matrix[i][0]) return true;
           else if(target>matrix[i][0])row=i;
        }

        if(row==-1)return false;

        int left=1; int right=m-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(matrix[row][mid]==target)return true;
            else if(target<matrix[row][mid])right=mid-1;
            else left=mid+1;
        }

        return false;
    }
}
