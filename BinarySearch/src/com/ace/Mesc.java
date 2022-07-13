package com.ace;

import java.util.Arrays;

public class Mesc {
    public static void main(String[] args) {
        int r = 1;
        int c = 4;
        int [][] mat = {
                {1,2},
                {3,4}
        };
        int [][] ans = reshape(mat,r,c);
        for (int [] ry: mat) {
            System.out.println(Arrays.toString(ry));
        }


    }

    static int[][] reshape(int[][] mat, int r, int c) {
        int row = mat.length;
        int col = mat[0].length;
        if(row * col != r * c){   //if no. of elements are not equal,give back mat
            return mat;
        }
        int [][] rxc = new int[r][c];  //creating requested reshaped matrix
        for(row = 0;row < mat.length;row++){
            int i =0;
            for(col = 0;col < mat[row].length;col++){
                rxc[] =
            }
}
