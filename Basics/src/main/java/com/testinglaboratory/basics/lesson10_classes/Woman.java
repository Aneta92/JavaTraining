package com.testinglaboratory.basics.lesson10_classes;

import com.github.javafaker.Faker;

import java.util.Random;

public class Woman extends Human {
    @Override
    public String toString() {
        return "Woman{" +
                "bornChildren=" + bornChildren +
                ", breastSize=" + breastSize +
                ", collectedShoes=" + collectedShoes +
                ", health=" + health +
                ", sex='" + sex + '\'' +
                '}';
    }

    private final int bornChildren = new Faker().random().nextInt(10);
    private final char breastSize = (char) (new Random().nextInt(26) + 'a');
    private final int collectedShoes = new Faker().random().nextInt(100);

}
