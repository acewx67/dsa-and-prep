package com.ace;

public class LargestNumber {
    public static void main(String[] args) {
        //Find the greatest digit in last(left most) place

        //So get the total digits of a number by log10(num)
        //divide num by 10^(int)log10(num) to get leftmost digit
        int [] arr = {3,30,34,5,9};
        String ans = "";
        for(int i = 0;i < arr.length;i++){  //run n times
            int maxLeftMostDigit = Integer.MIN_VALUE;
            int index = -1;

            for(int j = 0;j<arr.length && arr[j] != Integer.MIN_VALUE;){
                int digits = (int)Math.log10(arr[j]) + 1;
//                int totalDigits = digits + 1;
                int leftMostDigit = arr[j] < 10 ? arr[j] : arr[j]/(int)Math.pow(10,digits);
                if(leftMostDigit > maxLeftMostDigit){
                    maxLeftMostDigit = leftMostDigit;
                    index = j;
                    arr[j] = Integer.MIN_VALUE;
                }
                j++;
            }
            if(index != -1) ans += arr[index] + "";
        }
        System.out.println(ans);
    }
}
