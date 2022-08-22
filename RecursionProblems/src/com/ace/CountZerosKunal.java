package com.ace;

public class CountZerosKunal {
    public static void main(String[] args) {
        int n = 3020004;
        System.out.println(count(n));
    }
    static int countzero(int n,int count){
        if(n == 0) {
            return count;
        }
        if(n%10 == 0){
            count++;
        }
        return countzero(n/10,count);
    }






    static int count(int n){
        return helper(n,0);
    }
    private static int helper(int n,int count){
        if(n == 0){
            return count;
        }
        if(n%10 == 0){
            return helper(n/10,count+1);
        }
        else return helper(n/10,count);
    }
}
