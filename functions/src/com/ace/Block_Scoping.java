package com.ace;

public class Block_Scoping {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        {
            System.out.println(a);
            a = 60;                 //only updating a
            System.out.println(a);
            int c = 50;
            System.out.println(c);
        }
        System.out.println(a); //cannot use c outside block, but can be reinitialized again after used in block
        int c = 60;
        System.out.println(c);
    }
}
