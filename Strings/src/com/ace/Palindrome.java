package com.ace;

public class Palindrome {

    public static void main(String[] args) {
	// write your code here
        String word = "racecar";
        System.out.println(Checkifpalindrome(word));


    }
    static boolean Checkifpalindrome(String word){
        char [] arr = word.toCharArray();
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            if(arr[start] != arr[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
