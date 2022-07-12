package com.ace;

public class EvenDigitsProblem {
    public static void main(String[] args) {
        int [] nums = {1,3456,567,45,678,456};
            System.out.print(even(nums));

    }
    static int even(int [] numse){
            int even_digs = 0;

            for(int i=0; i< numse.length; i++){
                int rem = -1;
                int count = 0;
                int num = numse[i];
                while(num > 0){
                    rem = num % 10;
                    num = num/10;
                    count++;
                }
                if(count%2 == 0){
                    even_digs++;
                }
            }

            return even_digs;
    }
}
