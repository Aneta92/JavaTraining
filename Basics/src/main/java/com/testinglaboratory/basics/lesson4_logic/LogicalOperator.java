package com.testinglaboratory.basics.lesson4_logic;

public class LogicalOperator {


    public static void main(String[] args) {
        int one = 1;
        int two = 2;

        String four = "four";
        String five = "five";

        System.out.println("Logical Operators < > == !=  <= >=");
        System.out.println("is one is smaller than two? " + (one < two));
        System.out.println("is two is smaller than one? " + (one > two));
        System.out.println("is one is equal than two? " + (one == two));
        System.out.println("is one is different than two? " + (one != two));

        System.out.println(four == five);

        System.out.println(four.equals(five));

        //TODO declare two identical numbers and string and try to compare it
        int seven1 = 7;
        int seven2 = 7;

        String sevenString3 = new String("seven");
        String sevenString4 = new String("seven");
        System.out.println("Logical Operators < > == !=  <= >=");
        System.out.println("is one is smaller than two? " + (seven1 < seven2));
        System.out.println("is two is smaller than one? " + (seven1 > seven2));
        System.out.println("is one is equal than two? " + (seven1 == seven2));
        System.out.println("is one is different than two? " + (seven1 != seven2));

        System.out.println(sevenString3.intern() == sevenString4.intern());
        //System.out.println(sevenString3 == sevenString4);  - jeśli są zadeklarowane obiekty wyżej wtedy to da false, poniewąż pobiera z różnych miejsc w pamięci i w tym przypadku da false i bezpieczniejsze jest używanie equals
        // System.out.println(sevenString3.intern() == sevenString4.intern()); - w takim przypadku jest prawidłowa wartość jeśli doda się intern

        System.out.println(sevenString3.equals(sevenString4));
    }
}
