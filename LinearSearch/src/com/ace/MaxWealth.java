package com.ace;

public class MaxWealth {
    public static void main(String[] args) {
        int [][] arr = {
                {1,2,3},
                {1,3,4},
                {1,5,2}
        };
        System.out.println(maxwealth(arr));
    }

    static int maxwealth(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            int sum = 0;
            for (int col = 0; col < arr[row].length; col++) {
                    sum += arr[row][col];
            }
            if(sum > max){
                max = sum;
            }
        }
        return max;
    }
}
