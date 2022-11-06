package com.testinglaboratory.basics.lesson5_access;

public class AccessLevels {

    int numberOne = 1;
    private int numberTwo = 2;
    public int numberThree = 3;
    protected int numberFour = 4;

    static int numberFive = 5;
    final int numberSix = 6;

    static final private String experimets = "it must be initialized";
    static final public String sampleStaticText = "it must be";
    final public String sampleText = "it must be";

    public int getNumberTwo(){
        return numberTwo;
    }

    public int someInt;

    public AccessLevels() {
    }
    public AccessLevels(int someInt) {

        this.someInt = someInt;
    }
    public static void modify5(){

        numberFive = 6;
    }

    public static void modify5(int someNumber){

        numberFive = 6;
    }
    //todo declare yours own variables

}
