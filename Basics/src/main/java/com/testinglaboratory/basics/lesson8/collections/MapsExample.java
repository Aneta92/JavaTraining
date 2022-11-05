package com.testinglaboratory.basics.lesson8.collections;

import com.testinglaboratory.basics.lesson6_classes_introduction.ClassCar;
import com.testinglaboratory.basics.lesson6_classes_introduction.ClassConventions;

import java.util.HashMap;
import java.util.Map;

public class MapsExample {
    @Override
    public String toString() {
        return "MapsExample{}";
    }

    public static void main(String[] args) {
        Map<String, Integer> stringKeyIntValue;
        Map<String, Integer> stringKeyIntValueOf = Map.of("Str", 1);
        Map<String, ClassConventions> myMap = new HashMap<>();

        ClassConventions clasCon = new ClassConventions();
        myMap.put("My convention", clasCon);

        ClassConventions objectClassConventions = myMap.get("My convention");

        myMap.remove("someKey");

        //todo create map with numbers as Keys and YourOwnClass form lesson 6. Discover some useful maps methods

        Map<String, ClassCar> carsMap = new HashMap<>();
        ClassCar classCar = new ClassCar("auto", "black", 5, "sedan");
        carsMap.put("Samochod drewniany", new ClassCar("auto", "black", 5, "sedan"));
        carsMap.put("Auto2", new ClassCar("bus", "green", 4, "sss"));
        carsMap.put("Auto22", new ClassCar("SUV", "grey", 3, "saaa"));

        System.out.println(carsMap);
        System.out.println(carsMap.get("Auto22"));
        System.out.println(carsMap.getOrDefault("Samochod drewniany", new ClassCar("dddd", "fff", 7, "nnn")));
    }


}
