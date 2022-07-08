package com.ace;

import java.util.Scanner;

public class Linear_Search {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        int search_element = in.nextInt();
        int [] arr ={1,7,23,45,67,89,100};
        int result = linear_search(arr,search_element);
        System.out.println("position of element is " + (result + 1));
    }

    static int linear_search(int[] arr,int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num){
                return i;
            }

        }
        return -1;
    }
}
