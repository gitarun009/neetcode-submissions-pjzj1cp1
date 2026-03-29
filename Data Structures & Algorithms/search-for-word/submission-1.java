class Solution {
    public boolean exist(char[][] board, String word) {
        boolean[][] vis = new boolean[board.length][board[0].length];
        
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(backtrack(vis, board, word, i, j, 0)) return true;
            }
        }
        return false;
    }

    public boolean backtrack(boolean[][] vis, char[][] board, String word, int i, int j, int k){
        
        // base case
        if(k == word.length()) return true;

        // boundary + mismatch + visited
        if(i < 0 || j < 0 || i >= board.length || j >= board[0].length 
           || vis[i][j] || board[i][j] != word.charAt(k)){
            return false;
        }

        vis[i][j] = true;

        boolean found = backtrack(vis, board, word, i+1, j, k+1) ||
                        backtrack(vis, board, word, i-1, j, k+1) ||
                        backtrack(vis, board, word, i, j+1, k+1) ||
                        backtrack(vis, board, word, i, j-1, k+1);

        vis[i][j] = false;

        return found;
    }
}