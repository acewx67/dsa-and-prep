package com.ace;

import java.util.HashMap;
import java.util.Map;

public class GridTraveller {
    public static void main(String[] args) {
        Map<String,Long> memo = new HashMap<>();
        System.out.println(GridTravel(3,2,memo));
    }
    static Long GridTravel(int r, int c, Map<String,Long> memo){
        String rc = r + "," + c;
        String cr = c + "," + r;
        if(memo.containsKey(rc)){
            return memo.get(rc);
        }


        if(r==0 || c==0){
            return 0L;
        }
        if(r==1 && c==1){
            return 1L;
        }
        Long going_down = GridTravel(r-1,c,memo);
        Long going_right = GridTravel(r,c-1,memo);
        memo.put(rc,going_down + going_right);

        return memo.get(rc);
    }
}
