package com.ace;

import java.util.ArrayList;
//IM PROUD OF MYSELF,THIS CODE TOOK ME more than 2 weeks to understand it and I CODED THIS MYSELF
public class Subsets {
    public static void main(String[] args) {
        subsets("abc","",list);
        System.out.println(list);
    }
    static ArrayList<String> list = new ArrayList<String>();
    static void subsets(String up, String p, ArrayList<String> list){
        if(up.isEmpty()){
            return;
        }
        list.add(p + up.charAt(0));
        subsets(up.substring(1),p + up.charAt(0),list);
        subsets(up.substring(1),p,list);
    }
}
