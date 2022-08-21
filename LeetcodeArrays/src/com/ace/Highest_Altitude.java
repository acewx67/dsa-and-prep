package com.ace;

public class Highest_Altitude {
    public static void main(String[] args) {
        int [] gain = {-4,-3,-2,-1,4,3,2};
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0;i < gain.length;i++){
            sum = sum + gain[i];
            if(sum > max){
                max = sum;
            }
        }
        if(max < 0){
            max = 0;
        }
        System.out.println(max);
    }
}
