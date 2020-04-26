package com.company;

import java.util.Calendar;

public class Arming extends Tank { //Выпуск Вооружения

    public Arming(Manufacturer nameManufacturer, Guns guns, int[] numberOfMonth) {
        super(nameManufacturer, guns, numberOfMonth);
    }


    public static void createTable (int month){

        Tank arming0 = new Arming(Manufacturer.KHARKIV, Guns.L11, new int[]{166, 85, 17, 0, 0, 0});
        Tank arming1 = new Arming(Manufacturer.KHARKIV, Guns.F34, new int[]{0, 0, 117, 140, 121, 170});
        Tank arming2 = new Arming(Manufacturer.STALINGRAD, Guns.L11, new int[]{2, 28, 45, 0, 0, 0});
        Tank arming3 = new Arming(Manufacturer.STALINGRAD, Guns.F34, new int[]{0, 0, 0, 63, 70, 86});

        Object[] arming;
        arming = new Object[]{arming0, arming1, arming2, arming3};


        for (Object x : arming) {
            columnMonth((Tank) x, month);

        }
    }


    public static void columnMonth(Tank arming, int month) { // печатает столбец по выранному месяцу

        if (arming.numberOfMonth[month] > 0) {
            System.out.print(arming.nameManufacturer.getNameRU() + "|");
            System.out.print(arming.guns.getNameRu() + "|");
            System.out.print(arming.numberOfMonth[month] + "|"); // цифра [0] - Январь, 1-Февраль и т.д.
            System.out.println();
        }
    }



    }

