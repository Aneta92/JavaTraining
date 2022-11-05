package com.testinglaboratory.basics.lesson6_classes_introduction;

public class RunnableClassExcercise {

    public static void main(String[] args) {

        ClassConventions classObjectDeclaration;

        ClassConventions someClass = new ClassConventions();
        ClassConventions classConventionsPreDef = new ClassConventions("preDef");

        System.out.println(someClass);
        System.out.println(someClass.getField());
        System.out.println(someClass.getNumber());

        System.out.println(classConventionsPreDef);
        System.out.println(classConventionsPreDef.getField());
        System.out.println(classConventionsPreDef.getOtherField());
        System.out.println(classConventionsPreDef.getNumber());

        classConventionsPreDef.incrementNumber();

        //TODO create Yours Own Class representing a Toy. (max 4 fields name,color etc.) and implements operations on it;
        ClassCar classCar = new ClassCar("audi", "black", 5, "sedan");
        System.out.println("Car: " + classCar);
        System.out.println("Car: " + classCar.getName());
        System.out.println("Car: " + classCar.getColor());
        System.out.println("Car: " + classCar.getNumberOfDoors());
        System.out.println("Car: " + classCar.getTypeOfCar());

       // classCar.typeOfCar = "bus";
       // classCar.numberOfDoors = 6;

        System.out.println("Car: " + classCar);
        System.out.println("Car: " + classCar.getName());
        System.out.println("Car: " + classCar.getColor());
        System.out.println("Car: " + classCar.getNumberOfDoors());
        System.out.println("Car: " + classCar.getTypeOfCar());

        classCar.modifyColor("green");

        System.out.println("Car: " + classCar);
        System.out.println("Car: " + classCar.getName());
        System.out.println("Car: " + classCar.getColor());
        System.out.println("Car: " + classCar.getNumberOfDoors());
        System.out.println("Car: " + classCar.getTypeOfCar());

        classCar.modifyNumberOfPassagers(10);

        System.out.println("Car: " + classCar);
        System.out.println("Car: " + classCar.getName());
        System.out.println("Car: " + classCar.getColor());
        System.out.println("Car: " + classCar.getNumberOfDoors());
        System.out.println("Car: " + classCar.getTypeOfCar());
        System.out.println("Car: " + classCar.getNumberOfPassagers());

        ClassCar bus = new ClassCar("audi", "black", 5, "autobus");

        //bus.modifyNumberOfPassagers(40);
        System.out.println("Values:");
        System.out.println(bus);
        System.out.println(bus.getName());
        System.out.println(bus.getColor());
        System.out.println(bus.getNumberOfDoors());
        System.out.println(bus.getTypeOfCar());
        System.out.println(bus.getNumberOfPassagers());
    }
}
