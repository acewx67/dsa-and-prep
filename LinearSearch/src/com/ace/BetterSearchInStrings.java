package com.ace;

import static com.ace.SearchInStrings.Search;

public class BetterSearchInStrings {
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
        for (char in :stri.toCharArray()) {
            if(ch == in){
                return true;
            }

        }
        return false;

    }
}
