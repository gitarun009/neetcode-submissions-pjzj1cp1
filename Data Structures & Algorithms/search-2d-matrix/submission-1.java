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

        for(int j=1; j<m;j++){
            if(target==matrix[row][j])return true;
        }
        return false;
    }
}
