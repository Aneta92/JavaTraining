package com.testinglaboratory.basics.lesson4_logic;

import java.util.Scanner;

public class FlowControlExcercise {

    public static void main(String[] args) {
        //todo try to load two numbers from user and compare it with all operators that you already know
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number a: ");
        int a = scanner.nextInt();
        System.out.println("Number b: ");
        int b = scanner.nextInt();

        System.out.println("A > B? " + (a > b));
        System.out.println("A < B? " + (a < b));
        System.out.println("A is equal B? " + (a == b));
        System.out.println("A is not equal B? " + (a != b));
    }
}
