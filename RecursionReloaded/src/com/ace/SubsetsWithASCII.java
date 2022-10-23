package com.ace;

import java.util.ArrayList;

public class SubsetsWithASCII {
    public static void main(String[] args) {
        subset("abc","",list);
        System.out.println(list);
    }
    static ArrayList<String> list = new ArrayList<String>();
    static void subset(String up, String p, ArrayList<String> list){
        if(up.isEmpty()){
            return;
        }
        list.add(p + up.charAt(0));
        subset(up.substring(1),p + up.charAt(0),list);
        subset(up.substring(1),p,list);
    }
}
