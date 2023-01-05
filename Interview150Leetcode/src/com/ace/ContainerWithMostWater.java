package com.ace;
//BRUTEFORCE APPROACH
public class ContainerWithMostWater {
    public static void main(String[] args) {
        int []arr = {1,8,6,2,5,4,8,3,7};
//        int max = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i+1; j < arr.length; j++) {
//                if(arr[i] < arr[j]){
//                    if(max < (j-i) * arr[i]) max = (j-i) * arr[i];
//                }
//                else if(max < (j-i) * arr[j]){
//                    max = (j-i) * arr[j];
//                }
//            }
//        }
//        System.out.println(max);
        System.out.println(optimized(arr));
    }

//OPTIMIZED SOLUTION
    static int optimized(int [] arr){
        int max = 0;
        int l=0,r = arr.length-1;
        while(l < r){
            if(max < Math.min(arr[l],arr[r]) * (r-l)){
                max = Math.min(arr[l],arr[r]) * (r-l);
            }
            if(arr[l] > arr[r]){
                r--;
            } else if (arr[l] == arr[r]) {
                if(arr[l+1] > arr[r-1]) l++;
                else r--;

            } else l++;
        }
        return max;
    }
}
