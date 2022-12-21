package com.ace;

import com.sun.security.jgss.GSSUtil;

import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public static void main(String[] args) {
        String s = "anagram",t = "nagaram";
        if(t.length() > s.length()){
            System.out.println(false);
        }
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i),map.get(s.charAt(i)) + 1);
            }
            else{
                map.put(s.charAt(i),1);
            }
        }
        Map<Character,Integer> map1 = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            if (map1.containsKey(t.charAt(i))) {
                map1.put(t.charAt(i),map1.get(t.charAt(i)) + 1);
            }
            else{
                map1.put(t.charAt(i),1);
            }
        }
        System.out.println(map.equals(map1));

    }
}
