package easy;

import java.util.*;

public class MajorityElement169 {
    public static void main(String[] args) {
        int []arr = {2,2,1,1,1,2,2};
        Arrays.sort(arr);
        System.out.println(arr[arr.length/2]);
//        System.out.println(major(arr));
    }
//    static int major(int [] arr){
//        int count = 0;
//        for (int i = 0; i < arr.length-1; i++) {
//
//            if(arr[i] == arr[i+1]){
//                count++;
//                if(count >= arr.length/2){
//                    return arr[i];
//                }
//            }
//        }
//        return -1;
//    }
}
