package com.ace;

import java.util.Arrays;

public class Variable_Length_Arguments {
    public static void main(String[] args) {
        fun(10,1,1,1,2,3,4);
    }

    static void fun(int ...i) {        //stored in an int array,can be of any other datatype also..like string,byte etc
        System.out.println(Arrays.toString(i));
    }
}
