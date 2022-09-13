package com.ace;

public class SkipSubString {
    public static void main(String[] args) {
        String str = "appbappbacappledef";
        System.out.println(skipAppNotApple(str));
//        System.out.println(skipApple(str));
    }
    static String skipApple(String str){
        if(str.isEmpty()){
            return "";
        }
        char ch = str.charAt(0);
        if(str.startsWith("apple")){
            return skipApple(str.substring(5));
        }
        //uncomment the below if want to remove 'a' as well as "apple"


//        else if(ch == 'a'){
//            return skipApple(str.substring(1));
//        }
        else{
            return ch + skipApple(str.substring(1));
        }
    }

    static String skipAppNotApple(String str){
        if(str.isEmpty()){
            return "";
        }
        char ch = str.charAt(0);
//        if(str.startsWith("apple")){
//            return "apple" + skipAppNotApple(str.substring(5));
//        }
//        else if(str.startsWith("app")){
//            return skipAppNotApple(str.substring(3));
//        }

        if(str.startsWith("app") && !str.startsWith("apple")){
            return skipAppNotApple(str.substring(3));
        }
        else{
            return ch + skipAppNotApple(str.substring(1));
        }
    }
}
