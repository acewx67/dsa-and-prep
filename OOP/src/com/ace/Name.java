package com.ace;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Name{
    public static void main(String[] args) {

        int [] arr1 = {1,2,3,0,0,0};
        int m = 3;
        int [] arr2 = {2,5,6};
        int n = 3;
        int p = 0;
        int q = 0;
        int[] ans = new int[arr1.length];
        int i = 0;
        while (i < ans.length) {

            if (p >= m || q >= n) break;

            if (arr1[p] <= arr2[q]) {
                ans[i] = arr1[p];
                p++;
            } else {
                ans[i] = arr2[q];
                q++;
            }

            i++;

        }

        if (p < m) {
            for (int t = p; t < m; t++) {
                ans[i] = arr1[t];
                i++;
            }

        } else if (q < n) {
            for (int t = q; t < n; t++) {
                ans[i] = arr2[t];
                i++;
            }
        }

        arr1 = Arrays.copyOfRange(ans, 0, ans.length);
        System.out.println(Arrays.toString(arr1));
    }

}
