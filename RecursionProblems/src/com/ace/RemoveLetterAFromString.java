package com.ace;

public class RemoveLetterAFromString {
    public static void main(String[] args) {
        String str = "abapplecdaeafagaha";
        StringBuilder a = new StringBuilder(str);
        System.out.println(remove(a,0,str.length()));
    }
    static StringBuilder remove(StringBuilder ans,int index,int size){
        if(index >= size){
            return ans;
        }
//        if(index+4 < size && ans.toString().substring(index,index+4).contains("apple")){
//            ans.delete(index,index+4);
//            index = index - 5;
//            size = size - 5;
//        }
        if(ans.charAt(index) == 'a'){
            ans.deleteCharAt(index);
            index--;
            size--;
        }

        return remove(ans,++index,size);
    }
}
