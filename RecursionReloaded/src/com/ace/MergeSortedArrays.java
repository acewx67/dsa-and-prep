package com.ace;

import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int [] arr = {1,3,5,7};
        int [] nums = {2,4,6};
        int m = arr.length;
        int p = 0;
        int q = 0;
        int [] ans = new int[m+ nums.length];
        int i = 0;
        while(i < ans.length){
            if(p >= m){
                for (int j = q; j < nums.length; j++) {
                    ans[i] = nums[j];
                    i++;
                }
            }
            else if(q >= nums.length){
                for (int j = p; j < m; j++) {
                    ans[i] = arr[j];
                    i++;
                }
            }
            else {
                if (arr[p] <= nums[q]) {
                    ans[i] = arr[p];
                    p++;
                    i++;
                } else if (nums[q] < arr[p]) {
                    ans[i] = nums[q];
                    q++;
                    i++;
                }
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
