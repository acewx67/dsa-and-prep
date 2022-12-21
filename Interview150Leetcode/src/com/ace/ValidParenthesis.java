package com.ace;
//this shit doesnt work! :(
public class ValidParenthesis {
    public static void main(String[] args) {
        String s = "{[]}";
        System.out.println(valid(s));

    }

    static boolean valid(String str){
        if(str.length()%2 != 0) return false;

        int i = (str.length()/2)-1;
        for(int j=str.length()/2;j<str.length();j++){

            if(str.charAt(i) == '(' && str.charAt(j) == ')' ){
                i--;
            } else if (str.charAt(i) == '[' && str.charAt(j) == ']' ){
                i--;
            } else if (str.charAt(i) =='{' && str.charAt(j) == '}' ) {
                i--;
            }
            else return false;

        }
        return true;
    }
}
