package com.ace;

import java.util.HashMap;
//////DIS A TOUGH NUT
public class RomanInteger {
    public static void main(String[] args) {
        String s = "MCM";
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
//        int ans = map.get(s.charAt(0));
        int ans = 0;
        for (int i = 0; i < s.length()-1; i+=2) {
            //if next element is larger than present add both
            if(map.get(s.charAt(i)) >= map.get(s.charAt(i+1))){
                ans += map.get(s.charAt(i)) + map.get(s.charAt(i+1));
            }
            else{
                ans += map.get(s.charAt(i+1)) - map.get(s.charAt(i));
            }
//            if(map.get(s.charAt(i)) >= map.get(s.charAt(i+1))){
//                ans += map.get(s.charAt(i)) + map.get(s.charAt(i+1));
//            }
//            else{
//                ans += map.get(s.charAt(i+1)) - map.get(s.charAt(i));
//            }
        }
        if(s.length()%2 != 0) {
            ans += map.get(s.charAt(s.length() - 1));
        }
        System.out.println(ans);
    }
}
