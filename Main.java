class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Character,Integer>[] hm1 = new HashMap[9];
        HashMap<Character,Integer>[] hm2 = new HashMap[9];
        HashMap<Character,Integer>[] hm3 = new HashMap[9];
        for(int i=0;i<9;i++){
            hm1[i]= new HashMap<>();
            hm2[i]=new HashMap<>();
            hm3[i]=new HashMap<>();
        }
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.') continue;
                else{       
                hm1[i].put(board[i][j],  hm1[i].getOrDefault(board[i][j], 0)+1);
                hm2[j].put(board[i][j],  hm2[j].getOrDefault(board[i][j], 0)+1);
                int bi=(i/3)*3+(j/3);
                hm3[bi].put(board[i][j],  hm3[bi].getOrDefault(board[i][j], 0)+1);               
                if(hm1[i].get(board[i][j])>1||hm2[j].get(board[i][j])>1||hm3[bi].get(board[i][j])>1){
                    return false;
                }
                }
            }
        }
        return true;
    }
}
