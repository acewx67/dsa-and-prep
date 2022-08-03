package com.ace;

public class PalindromeKunal {
    public static void main(String[] args) {
        String word = "";
        System.out.println(check(word));
    }
    static boolean  check(String word){
        word = word.toLowerCase();  //puts all characters in lowercase,any capital letter will give false answer
        int start = 0;
        int end = word.length()-1;
        if(word == null || word.length()==0){
            return false; //or true depending on interviewer

        }
        while(start<end){

            if(word.charAt(start) != word.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
