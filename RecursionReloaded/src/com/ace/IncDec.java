package com.ace;

public class IncDec {
    public static void main(String[] args) {
        IncDece(5,0);
    }
    static void IncDece(int a,int start ){
        System.out.println(start);
        if(start == a){
            return;
        }
        IncDece(a,++start);
        System.out.println(start);

    }

}

