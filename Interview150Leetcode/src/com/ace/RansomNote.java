package com.ace;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public static void main(String[] args) {
        Map<Character,Integer> map = new HashMap<>();
        String magazine = "aab";
        String ransomNote = "ab";

        for(int i = 0;i<magazine.length();i++) {
            if (map.containsKey(magazine.charAt(i))) {
                map.put(magazine.charAt(i), map.get(magazine.charAt(i)) + 1);
            } else {
                map.put(magazine.charAt(i), 1);
            }
        }
        System.out.println(map);
        for (int i = 0; i < ransomNote.length(); i++) {
            if(map.containsKey(ransomNote.charAt(i)) && map.get(ransomNote.charAt(i)) > 0){
                map.put(ransomNote.charAt(i),map.get(ransomNote.charAt(i))-1);
                continue;
            }
            System.out.println(false);
            break;
        }
        //if not printing false,means ans is true


    }
}
