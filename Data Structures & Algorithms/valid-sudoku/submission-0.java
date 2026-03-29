class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                    char k=board[i][j];
                    board[i][j]='.';
                    if(!isValid(i,j,k,board))return false;
                    board[i][j]=k;
                }
            }
        }
        return true;
    }
    public boolean isValid(int i, int j, char k, char[][]board){
        for(int a=0;a<9;a++){
            if(board[a][j]== k || board[i][a]==k || board[i/3*3+a/3][j/3*3+a%3]==k)return false;
        }
        return true;
    }
}
