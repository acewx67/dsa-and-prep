package com.ace;

public class SearchInStrings {
    public static void main(String[] args) {
        String str = "Ashfaq";
        char target = 'g';
        boolean ans = Search(str,target);
        System.out.println(ans);

    }
    static boolean Search(String stri ,char ch){
        if(stri.length() == 0){
            return false;
        }
        for (int i = 0; i < stri.length(); i++) {
            if(ch == stri.charAt(i)){
                return true;
            }

        }
        return false;

    }
}
