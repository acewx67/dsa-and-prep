package com.ace;

import java.util.ArrayList;
import java.util.Arrays;

public class FizzBuzzIteration {
    public static void main(String[] args) {
        int n = 15;
        ArrayList<String> list = new ArrayList<>();
        for(int i = 1;i <= n; i++){
            if(i % 3 == 0 && i % 5 == 0){
                list.add("FizzBuzz");
            }
            else if(i % 3 == 0){
                list.add("Fizz");
            }
            else if(i % 5 == 0){
                list.add("Buzz");
            }
            else{
                list.add(i + "");
            }
        }
        System.out.println(list);
    }
}
