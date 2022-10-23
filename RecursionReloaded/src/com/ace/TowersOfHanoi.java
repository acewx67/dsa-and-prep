package com.ace;

public class TowersOfHanoi {
    public static void main(String[] args) {
        toh(3,10,11,12);
    }
    static void toh(int n, int start, int end, int helper){
        if(n == 0){
            return;
        }
        toh(n-1,start,end,helper);
        System.out.println(n + "[" + start + "->" + helper + "]");
        toh(n-1,helper,end,start);
    }
}
