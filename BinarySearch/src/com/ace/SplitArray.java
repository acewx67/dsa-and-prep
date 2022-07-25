package com.ace;

public class SplitArray {
    public static void main(String[] args) {
        int []arr = {7,2,5,10,8};
        System.out.println(SplitArrayLargestSum(arr));
    }

    static int SplitArrayLargestSum(int[] arr) {
        int min_ans = LargestElement(arr);
        int max_ans = SumofArray(arr);
        int start = min_ans;
        int end = max_ans;
        int mid = 0;
        int m = 2;

        while(start < end){
            int sum = 0;
            int pieces = 1; //atleast 1 piece exists
            mid = (start + end)/2;
            for (int num:
                 arr) {
                if((sum+num)>mid){
                    sum = num;
                    pieces++;
                }
                else{
                    sum += num;
                }
            }
            if(pieces > m){
                start = mid + 1;
            }else{
                end = mid;
            }
        }
        return end; //when start=end

    }

    static int SumofArray(int[] arr) {
        int sum = 0;
        for (int num :arr) {
            sum += num;
        }
        return sum;
    }

    static int LargestElement(int [] arr){
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            if(num > max){
                max = num;
            }
        }
        return max;
    }
}
