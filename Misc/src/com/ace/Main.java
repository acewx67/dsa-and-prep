package com.ace;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(removeA("baccad","",0));
    }
    static String removeA(String orig,String ss,int index){
        if(index >= orig.length()){
            return ss;
        }
        ss = orig.substring(1);
        if(orig.charAt(index) == 'a'){
            return removeA(orig,ss,index+1);
        }
        else return removeA(orig, orig.charAt(index) + ss,index+1);
    }
}
