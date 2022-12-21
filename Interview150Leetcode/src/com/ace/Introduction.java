package com.ace;

import java.util.ArrayList;
import java.util.Arrays;

public class Introduction {
    String name;
    int age;
    String course;
    String college;
    private ArrayList<String> hobbies;
    private void about_myself(){
        System.out.println("Hi! my name is "+this.name+" and I am "+this.age+" years old.");
        System.out.println("I have done my Bachelor's of Engineering in "+this.course+" and graduated from "+this.college + " this year.");
        System.out.println("My hobbies include :"+ this.hobbies);
        System.out.println("and I love to learn and practise new technologies too!");

    }
    public static void main(String[] args) {
        Introduction Ashfaq = new Introduction();
        Ashfaq.name = "Mohammed Ashfaq";
        Ashfaq.age = 23;
        Ashfaq.course = "Electronics and Communication Engg.";
        Ashfaq.college = "Deccan College Of Engineering and Technology";
        String [] hobbies1 = {"Swimming","playing video games","learning about new things.."};
        Ashfaq.hobbies = new ArrayList<>();
        Ashfaq.hobbies.addAll(Arrays.asList(hobbies1));
        Ashfaq.about_myself();

    }
}
