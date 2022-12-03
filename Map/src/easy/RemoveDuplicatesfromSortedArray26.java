package easy;

import java.util.Arrays;

public class RemoveDuplicatesfromSortedArray26 {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};

        //DON'T JUST JUMP TO BINARY SEARCH WHEN U SEE SORTED ARRAY

//        int pointer = 0;
//        int j = 0;
//        for (int i = 0; i < arr.length-1; i++) {
//            int start = i;
//            int end = arr.length - 1;
//            int mid = 0;
//            while(start < end){
//                mid = (start+end)/2;
//                if(arr[mid] == arr[i] && arr[mid+1] > arr[i]){
//                    arr[j+1] = arr[mid+1];
//                    j++;
//                    pointer = mid+1;
//                    break;
//                }
//                else if(arr[mid] == arr[i]){
//                    start = mid;
//                }
//                else if(arr[mid] > arr[i]){
//                    end = mid;
//                }
//            }
//            i = pointer;
//        }
//        System.out.println(Arrays.toString(arr));

        System.out.println(dup(arr,0));
        System.out.println(Arrays.toString(arr));


    }
    static int dup(int [] arr,int k){
        int i = 0;
        for (int num:
             arr) {
            if(num > arr[i]){
                arr[++i] = num;
            }

        }
        return i+1;
    }

}
