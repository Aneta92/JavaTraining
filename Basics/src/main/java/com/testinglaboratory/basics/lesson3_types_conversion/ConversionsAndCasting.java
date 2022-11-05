package com.testinglaboratory.basics.lesson3_types_conversion;

public class ConversionsAndCasting {


    public static void main(String[] args) {
        int otherNumber = -10;
        System.out.println("Other number: " + otherNumber);
        double floatingPointNumber = 12.21;
        // conversion

        double castedFromInt = otherNumber;
        System.out.println("Coverted number:" + castedFromInt);
        int a = 5;

        //casting

        int fromDouble = (int)floatingPointNumber;
        double fromInt = (double)a;
        System.out.println("fromInt is: " + fromInt);

        Double classDouble = 2.2;
        Integer fromClassDouble = classDouble.intValue();

        System.out.println("before casting " +floatingPointNumber + " after casting " +fromDouble);

        int value = 1/4;
        System.out.println(value);

        double preciseValue = 1/4.0;

        System.out.println(preciseValue);

        char someLetter = 'a';
        System.out.println("some letter " +  someLetter );
        System.out.println("some letter converted to asci code " + (int)someLetter );
        System.out.println("some number to letter " + (char)666);

        //TODO try to cast two ints into double and two floats into int
        int firstInt = 11;
        int secondInt = 12;
        System.out.println("First Int: " + firstInt);
        System.out.println("Second Int: " + secondInt);
        double fromFirstIntToDouble = (double) firstInt;
        double fromSecondIntToDouble = (double) secondInt;
        System.out.println("First Double From Int: " + fromFirstIntToDouble);
        System.out.println("Second Double From Int: " + fromSecondIntToDouble);

        float firstFloat = 11.11f;
        float secondFloat = 22.22f;
        System.out.println("First float: " + firstFloat);
        System.out.println("Second float: " + secondFloat);

        int fromFirstFloatToInt = (int) firstFloat;
        int fromSecondFloatToInt = (int) secondFloat;
        System.out.println("First Int from Float " + fromFirstFloatToInt);
        System.out.println("Second Int from Float " + fromSecondFloatToInt);
    }
}
