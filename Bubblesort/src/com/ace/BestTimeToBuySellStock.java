package com.ace;

public class BestTimeToBuySellStock {
    public static void main(String[] args) {
        int [] arr = {2,1,4};
        System.out.println(best_time(arr));
    }
    static int best_time(int [] arr){
        int buy = Integer.MAX_VALUE;
        int sell = 0;
        for (int i = 0; i < arr.length; i++) {
            buy = Math.min(buy,arr[i]);
            sell = Math.max(sell, arr[i] - buy);
        }
        return sell;

    }
}
