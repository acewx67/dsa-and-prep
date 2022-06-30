package com.ace;

import java.util.Scanner;

public class Enhanced_switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a day number: ");
        int day = in.nextInt();
        int feature = in.nextInt();

        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                switch (feature) {                             //enhanced switch and nested switch
                    case 1 -> System.out.println("good day");
                    case 2 -> System.out.println("nice day");
                    default -> System.out.println("Enter valid number ");
                }break; //this break is important so next case dont execute
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("enter valid day number");
        }
    }
}
