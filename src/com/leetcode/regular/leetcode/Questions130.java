package com.leetcode.regular.leetcode;

/**
 * @author pengli
 * @create 2021-11-10 10:00
 *
 * 130. 被围绕的区域
 */
public class Questions130 {

    public void solve(char[][] board) {

        int yLen=board.length;
        int xLen=board[0].length;

        for(int i=0;i<yLen;i++){
            order(board,i,0);
            order(board,i,xLen-1);
        }
        for(int i=0;i<xLen;i++){
            order(board,0,i);
            order(board,yLen-1,i);
        }

        for(int i=0;i<yLen;i++){
            for(int j=0;j<xLen;j++){
                if(board[i][j]=='A'){
                    board[i][j]='O';
                }else if(board[i][j]=='O'){
                    board[i][j]='X';
                }
            }
        }
    }

    public void order(char [][] board,int x,int y){
        if(x<0|| x>=board.length ||y<0|| y>=board[0].length  || board[x][y]!='O'){
            return;
        }
        board[x][y]='A';
        order(board,x+1,y);
        order(board,x-1,y);
        order(board,x,y+1);
        order(board,x,y-1);
    }
}
