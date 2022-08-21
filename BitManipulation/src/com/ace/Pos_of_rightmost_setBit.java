package com.ace;

public class Pos_of_rightmost_setBit {
    public static void main(String[] args) {
        int num = 10;
        int ans = num & (-num);
        System.out.println(ans);
    }
}
