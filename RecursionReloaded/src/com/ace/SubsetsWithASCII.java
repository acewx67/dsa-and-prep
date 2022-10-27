package com.ace;

import java.util.ArrayList;

public class SubsetsWithASCII {
    public static void main(String[] args) {
//        subset("abc","");
        subsets("abc","",list);
        System.out.println(list);
    }
    static void subset(String up, String p){
        if(up.isEmpty()){
            return;
        }
        System.out.print(p + up.charAt(0) + " ");
        subset(up.substring(1),p + up.charAt(0));
        subset(up.substring(1),p);
        subset(up.substring(1),p + (up.charAt(0)+0));
    }

    static ArrayList<String> list = new ArrayList<String>();
    static void subsets(String up, String p, ArrayList<String> list){
        if(up.isEmpty()){
            return;
        }
        list.add(p + up.charAt(0));
        subsets(up.substring(1),p + up.charAt(0),list);
        subsets(up.substring(1),p,list);
        subset(up.substring(1),p + (up.charAt(0)+0));
    }
}
