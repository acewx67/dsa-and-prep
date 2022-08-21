package com.ace;

public class Sqrt_NonPerfectSquares {
    public static void main(String[] args) {
        int n = 40;
        int p = 3;
        System.out.println(Sqrt(n,p));
    }
    static double Sqrt(int n, int p){
        int s = 0, e = n,temp = 0;
        while(s <= e) {
            int m = s + (e - s) / 2;
            temp = m;
            if (m * m == n) {
                return m;
            }
            if (m * m > n) {
                e = m - 1;
            } else {
                s = m + 1;
            }
        }
        System.out.println(temp);
        //root is not found by binary search using this method
        //ngl this method kinda bad for large nums, gotta design one which uses BS's mid value after while loop breaks
        double root = 0.0;
        double incr = 0.1;
        for (int i = 0; i < p; i++) {
            while(root * root < n ){
                root+= incr;
            }
            root -= incr;
            incr /= 10;
        }
        return root;
    }
}
