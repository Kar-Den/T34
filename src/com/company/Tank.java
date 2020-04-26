package com.company;

import java.util.Arrays;

public abstract class Tank {

    protected Manufacturer nameManufacturer;  //  Производитель
    protected Arming arming; // Вооружение
    protected int[] numberOfMonth; // количество выпущеного вооружения по месяцам начиная с января, если выпуска не было ставим НОЛЬ;

    public Tank(Manufacturer Manufacturer, Arming Arming, int[] numberOfMonth) {
        this.nameManufacturer = Manufacturer;
        this.arming = Arming;
        this.numberOfMonth = numberOfMonth;
    }



     public String toString() {
       return "Производитель: " + nameManufacturer.getNameRU() +
               ", Вооружение: " + arming.getNameRu() +
               ", Выпуск по месяцам " + Arrays.toString(numberOfMonth);


    }

    public int[] getNumberOfMonth () {
        return numberOfMonth;
    }
}
