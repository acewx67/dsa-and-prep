package com.ace;

import java.util.ArrayList;
import java.util.Arrays;

public class GroupAnagrams {
    public static void main(String[] args) {
        String []strs = {"eat","tea","tan","ate","nat","bat"};
        char [][] arr = new char[strs.length][];
        int t1 = 0;
        for (String st:
             strs) {
            char [] temp = st.toCharArray();
            Arrays.sort(temp);
            arr[t1] = temp;
            t1++;
        }
//        for (char [] t3:
//             arr) {
//            System.out.println(Arrays.toString(t3));
//        }
        ArrayList<ArrayList<String>> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if(strs[i].equals("0")) continue;
            ArrayList<String> temp = new ArrayList<>();
            temp.add(strs[i]);
            for (int j = i+1; j < arr.length; j++) {
                if(strs[j].equals("0")) continue;
                if (Arrays.equals(arr[i], arr[j])){
                    temp.add(strs[j]);
                    strs[j] = 0 + "";
                }
            }
            list.add(temp);
        }
        System.out.println(list);
    }
}
