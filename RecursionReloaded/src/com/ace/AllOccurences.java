package com.ace;

import java.util.ArrayList;
import java.util.Arrays;

public class AllOccurences {
    public static void main(String[] args) {
        int [] arr = {10,20,30,10,40,50,60,10};
        int [] ans = {-1,-1,-1};
//        System.out.println(Arrays.toString(all(arr,0,ans,0,10)));
        System.out.println(allOcc(arr,0,new ArrayList<Integer>(),10));
    }
    static int [] all(int [] arr,int index,int []answer,int ansIndex,int target){
        if(index >= arr.length){
            return answer;
        }
        if(arr[index] == target){
            answer[ansIndex] = index;
            ansIndex++;
        }
        return all(arr,index+1,answer,ansIndex,target);
    }
    static ArrayList<Integer> allOcc(int [] arr, int index, ArrayList<Integer> list, int target){
        if(index >= arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return allOcc(arr,index+1,list,target);
    }
}
