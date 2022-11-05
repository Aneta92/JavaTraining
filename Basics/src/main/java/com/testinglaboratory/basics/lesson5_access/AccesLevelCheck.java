package com.testinglaboratory.basics.lesson5_access;

public class AccesLevelCheck {

    static AccessLevels accessLevelsOne = new AccessLevels(10);
    static AccessLevels accessLevelsTwo = new AccessLevels(27);
    static AccessLevels accessLevelsFive = new AccessLevels();
    static AccessLevels accessLevels = new AccessLevels();

    public static void main(String[] args) {
        example();
    }

    public static void example() {

        accessLevelsFive.modify5();
        accessLevelsOne.someInt = 0;
        accessLevelsTwo.someInt = 0;
        System.out.println();
        AccessLevels.numberFive = 7;
        System.out.println(accessLevels.getNumberTwo());

        System.out.println(accessLevels.numberOne);

        System.out.println(accessLevels.numberThree);

        accessLevels.numberThree = 7;

        System.out.println(accessLevels.numberFour);

        System.out.println(accessLevels.numberSix);

        System.out.println(AccessLevels.numberFive);

        System.out.println(accessLevels.sampleText);
        System.out.println(AccessLevels.sampleStaticText);

//TODO try to increase or modify each variable
    }


}
