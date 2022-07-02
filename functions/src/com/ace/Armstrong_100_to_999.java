package com.ace;

public class Armstrong_100_to_999 {
    public static void main(String[] args) {
        Armstrong();
    }

    static void Armstrong() {
        int number = 100;  //all armstrong from 100 till 999
        int last_digit = Integer.MIN_VALUE;
        int num = 0;
        int cubed_val = 0;

        while(number < 1000){
            int sum = 0;
            num = number;
            while(num > 0){
                last_digit = num % 10;
                cubed_val = last_digit * last_digit * last_digit;
                sum = sum + cubed_val;
                num = num/10;
            }
            if(sum == number){
                System.out.println(number);
            }
            number++;
        }
    }
}
