package com.ace;

import java.util.ArrayList;
import java.util.Arrays;

public class FindTargetIndicesAfterSortingArray {
    public static void main(String[] args) {
        int [] nums = {1,3,2,5,4};
        int target = 5;
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        int s = 0;
        int e = nums.length-1;

        int st = -1;
        int en = -1;

        while(s <= e){
            int mid = (s+e)/2;
            if(nums[mid] == target){
                st = mid;
                if(mid-1 < 0 || nums[mid-1] != nums[mid]){
                    s = mid;
                    e = nums.length-1;
                    break;
                }
                else e = mid;
            }
            else if(nums[mid] > target){
                e = mid-1;
            }
            else if(nums[mid] < target){
                s = mid+1;
            }
        }

        while(s <= e){
            int mid = (s+e)/2;
            if(nums[mid] == target){
                en = mid;
                if(mid+1 >= nums.length || nums[mid+1] != nums[mid]){
                    break;
                }
                else s = mid;
            }
            else if(nums[mid] > target){
                e = mid-1;
            }
            else if(nums[mid] < target){
                s = mid+1;
            }

        }

        for (int i = st; i<= en ; i++) {
            list.add(i);
        }
        System.out.println(list);
    }
}
