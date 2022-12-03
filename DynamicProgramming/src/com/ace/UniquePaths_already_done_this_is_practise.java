package com.ace;

import java.util.HashMap;
import java.util.Map;

public class UniquePaths_already_done_this_is_practise {
    public static void main(String[] args) {
        Map<String,Long> map = new HashMap<>();
        System.out.println(uniq(8,10,map));
    }
    static long uniq(int row, int col,Map<String,Long> memo){
        String row_col = row + "," + col;
        if(memo.containsKey(row_col)){
            return memo.get(row_col);
        }
        if(row < 0 || col < 0){
            return 0L;
        }
        if(row == 1 && col == 1){
            return 1L;
        }
        long right = uniq(row,col-1,memo);
        long down = uniq(row-1,col,memo);
        memo.put(row_col,right+down);
        return right+down;

    }
}
