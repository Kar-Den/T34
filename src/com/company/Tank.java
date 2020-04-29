package com.company;

import java.util.Arrays;

public abstract class Tank {

    protected Manufacturer nameManufacturer;  //  Производитель
    protected Guns guns; // Вооружение
    protected int[] numberOfMonth; // количество выпущеного вооружения по месяцам начиная с января, если выпуска не было ставим НОЛЬ;

    public Tank(Manufacturer Manufacturer, Guns Guns, int[] numberOfMonth) {
        this.nameManufacturer = Manufacturer;
        this.guns = Guns;
        this.numberOfMonth = numberOfMonth;

    }



     public String toString() {
       return "Производитель: " + nameManufacturer.getNameRU() +
               ", Вооружение: " + guns.getNameRu() +
               ", Выпуск по месяцам " + Arrays.toString(numberOfMonth);


    }

    public int[] getNumberOfMonth () {
        return numberOfMonth;
    }
}
