package com.ace;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class KWeakestRows {
    public static void main(String[] args) {
        int [][] mat = {
                {1,1,0,0,0},
                {1,1,1,1,0},
                {1,0,0,0,0},
                {1,1,0,0,0},
                {1,1,1,1,1}
        };
        int k = 3;
        int [] temp = new int [mat.length];

        //count of soldiers(1's)
        for(int i=0;i<mat.length;i++){
            int ans = 0;
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j] == 1) ans++;

            }
            temp[i] = (ans * 1000)+i;    //Merging row no. with count as we can retrieve by %1000 later
        }
        Arrays.sort(temp);
        int [] result = new int [k];
        for (int i = 0; i < k; i++) {
            result[i] = temp[i] % 1000;
        }
        System.out.println(Arrays.toString(result));
    }
}
