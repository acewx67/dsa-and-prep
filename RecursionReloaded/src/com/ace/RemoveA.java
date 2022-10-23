package com.ace;

public class RemoveA {
    public static void main(String[] args) {
        System.out.println(removea("baccad","",0));
    }
    static String rem(String str,String ans){
        if(str.isEmpty()){
            return ans;
        }
        if(str.charAt(0) != 'a'){
            ans = ans + str.charAt(0);
            return rem(str.substring(1),ans);
        }
        else {
            return rem(str.substring(1),ans);
        }
    }
    static String removea(String str, String ans,int i){
        if(i == str.length()){
            return ans;
        }
        if(str.charAt(i) != 'a'){
            ans = ans + str.charAt(i);
        }
        return removea(str,ans,i+1);
    }
}
