package easy;

import java.util.Arrays;

public class MergeIntervals {
    public static void main(String[] args) {
        int [][]arr = {
                {1,3},
                {2,6},
                {8,10},
                {15,18}
        };
        int [][] ans = new int [arr.length][];
        int j = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i+1][0] <= arr[i][arr[i].length-1]){
                ans[j][0] = arr[i][0];
                ans[j][arr[j].length-1] = arr[i+1][arr[i+1].length-1];
            }
            else{
                for (int k = i; k < arr.length; k++) {
                    for (int l = 0; l < arr[i].length; l++) {
                        ans[k][l] = arr[k][l];
                    }
                }
            }
        }
        for (int [] nums:
             ans) {
            System.out.println(Arrays.toString(nums));
        }
    }
}
