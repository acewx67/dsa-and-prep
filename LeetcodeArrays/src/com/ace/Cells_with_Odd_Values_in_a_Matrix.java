package com.ace;

import java.util.ArrayList;
import java.util.Arrays;

//Didn't Understand the question
public class Cells_with_Odd_Values_in_a_Matrix {
    public static void main(String[] args) {

        long numb = 0;
        int [] num = {1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,0,6,3};
        int k = 516;
        for (int i = 0; i < num.length; i++) {
            long mult = 1;
            for (int j = i+1; j < num.length; j++) {
                mult *= 10;
            }
            numb += num[i] * mult;
        }

        long sum = k + numb;
        long quo = sum;
        int count = 0;
        while (quo > 0) {
            quo = quo / 10;
            count++;
        }
        int [] array = new int[count];
        long quot = sum;
        long rem = 0;
        int i = 1;
        while (quot > 0 && i >=0) {
            rem = quot % 10;
            quot = quot / 10;
            array[array.length-i] = (int)rem;
            i++;
        }
        System.out.println(Arrays.toString(array));
        ArrayList<Integer> list = new ArrayList<>();
        for (int ar:
             array) {
            list.add(ar);
        }
        System.out.println(list);

    }
}
