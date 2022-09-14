package com.ace;

import java.util.ArrayList;

public class Isomorphic {
    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
//        ArrayList<Character> list = new ArrayList<>();
        char [] s_arr = s.toCharArray();
        char [] t_arr = t.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            int [] arr = new int[s_arr.length];
            arr[0] = i; //store position
            for (int j = i+1; j < s_arr.length; j++) {
                if(s_arr[i] == s_arr[j]){
                    arr[j] = j; //store position
                }
            }
            for (int j = 0; j < s_arr.length; j++) {
                if(s_arr[arr[i]] == )
            }
        }


    }
}
