package com.company;

public class Line extends Tank {

    public Line(Manufacturer nameManufacturer, Arming arming, int[] numberOfMonth) {
        super(nameManufacturer, arming, numberOfMonth);
    }

    @Override
    public void statistic() {
//        System.out.println("Производитель" + Manufacturer.Харьков);
    }
}
