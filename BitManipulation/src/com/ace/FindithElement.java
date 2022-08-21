package com.ace;

import java.util.Scanner;
// we will get answer in decimal only , so eg for num = 10 and n = 4 , we will get ans = 8, as at 4th position 1 is present
//followed by 3 zeroes so, in decimal it is 8
public class FindithElement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 2;
        int num = in.nextInt();
        int ans = num & (1 << (n-1));
        System.out.println(ans);
    }
}
