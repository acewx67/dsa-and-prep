package com.ace;
//Find the no. of times a digit given by user is repeating in a number also given by user.
import java.util.Scanner;

public class Repeating_Digits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = in.nextInt(); //number
        int remember_num = num;
        System.out.println("Enter the digit: ");
        int n = in.nextInt(); //digit
        int last_digit = Integer.MIN_VALUE;
        int count = 0;
        while(num > 0){
            last_digit = num %  10;
            if(last_digit == n){
                count++;
            }
            num = num/10;
        }
//        if(num == n){               use this if u use num >= 10, in while loop
//            count++;
//        }
        System.out.print("the digit is repeating "+ count +" times in the number " + remember_num);
    }
}