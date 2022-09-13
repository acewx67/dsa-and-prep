package com.ace;

import java.util.ArrayList;

public class SubSequencesAscii {
    public static void main(String[] args) {
        System.out.println(subAscii("","abc"));
    }
    static ArrayList<String> subAscii(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> first = subAscii(p+ch, up.substring(1));
        ArrayList<String> second = subAscii(p, up.substring(1));
        ArrayList<String> third = subAscii(p + (ch + 0),up.substring(1));
        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
