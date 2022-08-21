package com.ace;

public class Panagram {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        char [] sen = sentence.toCharArray();
        int count = 26;
        char character = 'a';
        for (int i = 0; i < sen.length; i++) {
            for (char ch : sen) {
                if (ch == character) {
                    character++;
                    count--;
                    break;
                }
            }
        }
        System.out.println(count==0); //this means all characters of the alphabet are present in the sentence
    }
}