package com.ace;

import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int [] nums = {0,0,4,4,5,5,7,7,9};
        Arrays.sort(nums);
        System.out.println(sing(nums));
    }
    static int sing(int [] nums){
        for(int i = 0;i<nums.length-1;i=i+2){
            if(nums[i] != nums[i+1]){
                if(i == 0) return nums[0];
                if(nums[i-1] != nums[i]) return nums[i];
                return nums[i+1];
            }
        }
        return nums[nums.length-1];
    }

}
