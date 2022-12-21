package com.ace;

public class Simplify_Path76 {
    public static void main(String[] args) {
        System.out.println(simp("/home//foo/"));
    }
    static String simp(String path){
        String ans = "";
        int i = 0,j =  0;
        if(path.charAt(0) != '/'){
            ans = ans + "/";
        }
        while(i < path.length()){
            while(path.charAt(i) == '/'){
                if(j == 0){
                    ans = ans + "/";
                    j++;
                }
                i++;
                if(i >= path.length()) break;
            }
            if(i >= path.length()) break;
            while(path.charAt(i) == '.' || path.charAt(i) == '_' ){
                i++;
                if(i >= path.length()) break;
            }
            ans += path.charAt(i);
            j = 0;
            i++;
        }
        if(ans.charAt(ans.length()-1) == '/') ans = ans.substring(0,ans.length()-1);
        return ans;
    }
}
