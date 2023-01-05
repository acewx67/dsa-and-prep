package com.ace;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionOfTWOarrays {
    public static void main(String[] args) {
        int []nums1 = {1};
        int [] nums2 = {1,2};

        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        ArrayList<Integer> list = new ArrayList<>();
        if(nums2.length <= nums1.length){
            for (int n:
                 nums2) {
                int t = bs(nums1,n);
                if(t == -1) continue;
                list.add(nums1[t]);
                nums1[t] = Integer.MIN_VALUE;

            }
            System.out.println(list);
        }
        else {
            for (int n :
                    nums1) {
                int t = bs(nums2, n);
                if (t == -1) continue;
                list.add(nums2[t]);
                nums2[t] = Integer.MIN_VALUE;

            }
            System.out.println(list);
        }
        int[] ans = new int[list.size()];
        int m = 0;
//        for (int n:
//             list) {
//            ans[m] = n;
//        }
        for (int j = 0; j < list.size(); j++) {
            ans[j] = list.get(j);
        }
        System.out.println(Arrays.toString(ans));





    }
    static int bs(int [] arr,int target){
        int s = 0;
        int e = arr.length;
        while(s <= e){
            int mid = (s+e)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid] < target){
                s = mid + 1;
            }
            else e = mid - 1;
        }
        return -1;
    }
}
