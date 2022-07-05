package com.ace;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_ {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        
        //input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
        for (int j = 0; j < 5; j++) {
            System.out.println(list.get(j)); //to get specific item from list need to use this get line

        }
        System.out.println(list); //or just use this
        

    }
}
