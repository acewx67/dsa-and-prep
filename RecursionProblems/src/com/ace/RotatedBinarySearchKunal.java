package com.ace;

public class RotatedBinarySearchKunal {
    public static void main(String[] args) {
        int [] arr = {5,7,8,9,1,2,3};
        int target = 3;
        System.out.println(RBSk(arr,target,0, arr.length-1));
    }
    static int RBSk(int [] arr,int target,int start,int end){
        if(start > end){
            return -1;
        }
        int mid = start + (end-start)/2;
        if(arr[mid] == target){
            return mid;
        }
        if(arr[start] <= arr[mid]){
            if(arr[start] <= target && target <= arr[mid]){
                return RBSk(arr,target,start,mid-1);
            }
            else{
                return RBSk(arr,target,mid+1,end);
            }
        }
        if(target >= arr[mid] && target < arr[end]){
            return RBSk(arr,target,mid+1,end);
        }
        else{
            return RBSk(arr,target,mid+1,end);
        }

    }
}
