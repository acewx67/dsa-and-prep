package com.ace;

import java.util.Arrays;

public class Search2Dmatrix {
    public static void main(String[] args) {
        int [][] mat = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 13;

        int colMid = mat[0].length/2;
        int rowStart = 0;
        int rowEnd = mat.length-1;

        while(rowEnd - rowStart > 1 ){
            int rowMid = (rowStart + rowEnd )/2;
//            if(mat[rowMid[0].length/2] == target) return true;

            if(mat[rowMid][colMid] < target) rowStart = rowMid; //cant use rowMid - 1 coz rowmid may contain target
                // if(mat[rowMid[0].length/2] > target)
            else rowEnd = rowMid;

        }

        //found our two rows which might contain target

        int ans1 = Arrays.binarySearch(mat[rowStart],target);
        int ans2 = Arrays.binarySearch(mat[rowEnd],target);
        if(ans1 < 0 && ans2 < 0){
            System.out.println(false);
        }
        else System.out.println(true);
    }
}
