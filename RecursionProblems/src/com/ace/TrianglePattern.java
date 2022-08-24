package com.ace;

public class TrianglePattern {
    public static void main(String[] args) {
        int n = 7;
        triangleKunal(7,0);
    }
    static void triangle(int n){
        if(n == 0){
            return;
        }
        for (int i = n; i > 0 ; i--) {
            System.out.print("* ");
        }
        System.out.println();
        triangle(n-1);
    }
    static void triangleKunal(int r,int c){
        if(r==0){
            return;
        }
        if(c < r){
            System.out.print("* ");
            triangleKunal(r,c+1);

        }
        else{
            System.out.println();
            triangleKunal(r-1,0);

        }
    }


    static void triangleKunal2(int r,int c){
        if(r==0){
            return;
        }
        if(c < r){
            triangleKunal2(r,c+1);
            System.out.print("* ");

        }
        else{
            triangleKunal2(r-1,0);
            System.out.println();

        }
    }
}
