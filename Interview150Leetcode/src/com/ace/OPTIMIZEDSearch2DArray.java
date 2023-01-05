package com.ace;

public class OPTIMIZEDSearch2DArray {
    public static void main(String[] args) {
        int [][]arr = {
                {1,3,5,7},{10,11,16,20},{23,30,34,60}
        };
        int target = 3;
        int rowStart = 0;
        int rowEnd = arr.length-1;
        int colMid = arr[0].length/2;
        while(rowStart < rowEnd - 1){
            int rowMid = (rowStart+rowEnd)/2;
            if(arr[rowMid][colMid] == target) System.out.println("target found at arr[" +rowMid+"]["+colMid+"]" );
            if(arr[rowMid][colMid] < target){
                rowStart = rowMid;
            }
            if(arr[rowMid][colMid] > target){
                rowEnd = rowMid;
            }
        }
        System.out.println(search(arr,target,rowStart,rowEnd));
    }
    static boolean search(int [][] arr,int target,int rowStart,int rowEnd){
        int cMid = arr[0].length/2;
        //check first half of the two arrays(0 to cMid)
        for (int i = 0; i < cMid; i++) {
            if(arr[rowStart][i] == target) return true;
        }
        for (int i = cMid; i < arr[0].length; i++) {
            if(arr[rowStart][i] == target) return true;
        }
        for (int i = 0; i < cMid; i++) {
            if(arr[rowEnd][i] == target) return true;
        }
        for (int i = cMid; i < arr[0].length; i++) {
            if(arr[rowEnd][i] == target) return true;
        }
        return false;
    }
}
