package com.ace;

public class RansomeNote {
    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "ab";
        System.out.println(ransom(ransomNote,magazine));

    }
    static boolean ransom(String ransomNote,String magazine ){
        if(ransomNote.isEmpty()) return true;
        if(!ransomNote.isEmpty() && magazine.isEmpty()) return false;


        for(int i = 0;i<magazine.length();i++){
            if(magazine.charAt(i) == ransomNote.charAt(0)) {
                return ransom(ransomNote.substring(1),magazine.substring(0,i)+magazine.substring(i+1));
            }
        }
        return false;
    }
}
