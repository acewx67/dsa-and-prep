package com.ace;

public class RemoveLetterA {
    public static void main(String[] args) {
//        remove("","baccaaad");
        System.out.println(skip1("abaaac"));
    }
    static void remove(String P,String UP){  //String UP is the original string
        if(UP.isEmpty()){
            System.out.println(P);
            return;
        }

        char ch = UP.charAt(0);
        if(ch == 'a'){
            remove(P,UP.substring(1));
        }else{
            remove(P + ch,UP.substring(1));
        }
    }
//MY IMPLEMENTATION :
    static void skip(String str, String temp){
        if(str.isEmpty()){
            System.out.println(temp);
            return;
        }
        char ch = str.charAt(0);
        if(ch == 'a'){
            skip(str.substring(1), temp);
        }
        else{
            skip(str.substring(1),temp + ch);
        }
    }
    static String skip1(String str){
        if(str.isEmpty()){
            return "";
        }
        char ch = str.charAt(0);
        if(ch == 'a'){
            return skip1(str.substring(1));
        }
        else{
            return ch + skip1(str.substring(1));
        }
    }
}
