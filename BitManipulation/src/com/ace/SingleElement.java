package com.ace;

public class SingleElement {
    public static void main(String[] args) {
        int [] arr = {2,3,4,1,2,1,3,6,4};
        System.out.println(findunique(arr));
    }

    static int findunique(int[] arr) {
        int ans = 0;
        for (int num:
             arr) {
             ans ^= num;
        }
        return ans;
    }
}
