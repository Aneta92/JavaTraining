package com.testinglaboratory.basics.lesson4_logic;

import java.util.Scanner;

public class FlowControl {
    public static void main(String[] args) {
        int firstNumberFromUser;

        Scanner scanner = new Scanner(System.in);
/*
        System.out.println("type some number   ");
        firstNumberFromUser = scanner.nextInt();

        if (firstNumberFromUser == 1) {
            System.out.println("you Type ONE");
        }

        if (firstNumberFromUser > 1) {
            System.out.println("you first number is bigger than ONE");
        }

        if (firstNumberFromUser > 0 && firstNumberFromUser < 100) {
            System.out.println("your number is bigger than 0 and smaller than 100");
        }

        if (firstNumberFromUser < 10 || firstNumberFromUser == 100) {
            System.out.println("your number is smaller than 10 or it is 100");
        }

        if (firstNumberFromUser < 0) {
            System.out.println("you numba is smaller than 0, yo!");
        } else {
            System.out.println("you numba must be bigger than 0, yo!");
        }

        switch (firstNumberFromUser) {
            case 5:
                System.out.println("you typed 5");
                break;
            case 6:
                System.out.println("you typed 6");
                break;
            case 7:
                System.out.println("you typed 7");
                break;
            case 1:
                System.out.println("I don't like 1 so I cant break it");
            default:
                System.out.println("Whatcha doin' chaps?");
        }
*/
        System.out.println("How old are you?");
        int age = scanner.nextInt();

        if (age >= 18){
            System.out.println("You are adult!");
        } else if (age >= 0 && age < 18){
            System.out.println("You are too young!");
        } else {
            System.out.println("The age is incorrect!");
        }

        switch (age) {
            case 20:
                System.out.println("You are adult!");
                break;
            case 15:
                System.out.println("You are too young!");
                break;
            default:
                System.out.println("The age is different than shown!");
        }
    }

}
