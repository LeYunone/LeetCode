package com.leetcode.regular.leetcode;

/**
 * @author pengli
 * @create 2021-11-29 10:00
 * 36. 有效的数独
 */
public class Questions36 {

    public boolean isValidSudoku(char[][] board) {
        int [] [] row=new int [9] [9];
        int [] [] columns=new int [9] [9];
        int [] [] [] range=new int [3] [3] [9];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==','){
                    continue;
                }
                int index= board[i][j]-'0'-1;
                row[i][index]++;
                columns[j][index]++;
                range[i/3][j/3][index]++;
                if(row[i][index]!=1 || columns[j][index]!=1 || range[i/3][j/3][index]!=1){
                    return false;
                }
            }
        }
        return true;
    }
}
