package com.ace;

import java.util.ArrayList;

public class SubSequence {
    public static void main(String[] args) {
        String str = "abc";
//        Subseq("",str);
        System.out.println(sub("",str));
    }
    //  p = processing or processed |   up= unprocessed
    static void Subseq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        Subseq(ch + p ,up.substring(1));
        Subseq(p , up.substring(1));

    }

    static ArrayList<String> sub(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = sub(p+ch, up.substring(1));
        ArrayList<String> right = sub(p, up.substring(1));
        left.addAll(right);
        return left;
    }
}
