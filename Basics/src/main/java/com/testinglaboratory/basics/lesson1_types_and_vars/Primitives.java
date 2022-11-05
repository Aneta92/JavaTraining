package com.testinglaboratory.basics.lesson1_types_and_vars;

import java.sql.SQLOutput;

public class Primitives {


    public static void main(String[] args) {

        int someNumber = 1;
        int otherNumber = -10;
        System.out.println("this is an number " + someNumber + " ant this is other " + otherNumber);

        boolean logicalPositiveValue = true;
        boolean logicalNegativeValue = false;
        System.out.println("logical values " + logicalNegativeValue + " / " + logicalPositiveValue);

        double floatingPointNumber = 12.21;
        float floatNumber = 21.12f;
        System.out.println("floating points values " + floatingPointNumber + " / " + floatNumber);


        //TODO declare 2 variables each type and print it.
        int firstNumber = 20;
        int secondNumber = 30;
        System.out.println("The first number is: " + firstNumber + " , the second number is: " + secondNumber);

        boolean logicalTrue = true;
        boolean logicalFalse = false;
        System.out.println("The true value is: " + logicalTrue + " , the false value is: " + logicalFalse);

        double floatingNumber = 3.55;
        float secondFloatNumber = 1.22f;
        System.out.println(floatingNumber + " Second " + secondFloatNumber);
    }
}
