package com.testinglaboratory.basics.lesson6_classes_introduction;

public class ClassCar {
    private String name;
    private String color;
    private String typeOfCar;
    private int numberOfDoors;

    private int numberOfPassagers;

    public ClassCar(String name, String color, int numberOfDoors, String typeOfCar) {
        this.name = name;
        this.color = color;
        this.numberOfDoors = numberOfDoors;
        this.typeOfCar = typeOfCar;
        this.numberOfPassagers = 0;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getTypeOfCar() {
        return typeOfCar;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public int getNumberOfPassagers() {
        return numberOfPassagers;
    }

    public void modifyColor(String color) {
        this.color = color;
    }

     public void modifyNumberOfPassagers(int numberOfPassagers){
        if (numberOfPassagers > 2){
            System.out.println("All places are busy");
        } else {
        this.numberOfPassagers = numberOfPassagers;
     }

}

    @Override
    public String toString() {
        return "ClassCar{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", typeOfCar='" + typeOfCar + '\'' +
                ", numberOfDoors=" + numberOfDoors +
                ", numberOfPassagers=" + numberOfPassagers +
                '}';
    }
}
