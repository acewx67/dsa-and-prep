package com.ace;

public class Find_the_oddnumber_in_array {
    public static void main(String[] args) {
        int [] arr = {2,2,3,2,7,7,8,7,8,8};
        int n = 1;
        int result = 0;
        for (int i = 1; i <= 4; i++) {   //it must go till the last set bit of a number,so better to go till max no's set bit,so that all nums are covered
            int sum = 0;
            for (int j = 0; j < arr.length; j++) {

                int num = arr[i];
                int ans = num & (1 << (n - 1));
                sum = sum + ans;
            }
            result = result + sum % 3;

        }
        System.out.println(result);
    }
}
