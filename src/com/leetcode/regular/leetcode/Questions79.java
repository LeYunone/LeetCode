package com.leetcode.regular.leetcode;

/**
 * @author pengli
 * @create 2021-10-09 16:59
 * 79. 单词搜索
 */
public class Questions79 {

    public static void main(String[] args) {
        exist(new char[][]{{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}},"ABCB");
    }

    public static boolean exist(char[][] board, String word) {
        boolean [] [] visted=new boolean [board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                boolean is=order(board, visted, word, i, j, 0);
                if(is){
                    return is;
                }
            }
        }
        return false;
    }

    public static boolean order(char [] [] borad ,boolean [] [] visted,String word,int i,int j,int index){
        if(borad[i][j]!=word.charAt(index)){
            return false;
        }
        if(index==word.length()-1){
            return true;
        }
        visted[i][j]=true;
        int [] [] moves=new int [] [] {{0,-1},{0,1},{-1,0},{1,0}};
        for(int [] move:moves){
            int x=move[1]+j; int y=move[0]+i;
            if(x<0 || x>=borad[0].length || y<0 || y>=borad.length){
                continue;
            }else{
                if(!visted[y][x]){
                    //如果这次遍历里这个元素没被访问过
                    boolean order = order(borad, visted, word, y, x, index + 1);
                    if(order){
                        return true;
                    }
                }
            }
        }
        //回溯操作
        visted[i][j]=false;
        return false;
    }
}
