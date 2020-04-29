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

//        System.out.println("");
        System.out.println("| ПРОИЗВОДИТЕЛЬ | ВООРУЖЕНИЕ |");
//        System.out.println("");


        for (Object x : arming) {
            columnMonth((Tank) x, month);

        }
    }


    public static void columnMonth(Tank arming, int month) { // печатает столбец по выранному месяцу
        int widthColumnManufacturer = 15;
        int widthColumnGuns = 10;
        int widthColumnMonth = 10;
        String manufacturer = "|" +arming.nameManufacturer.getNameRU() + "|";
        String guns = arming.guns.getNameRu() + "|";
        String numberOfMonth = arming.numberOfMonth[month] + "|";



        if (arming.numberOfMonth[month] > 0) {
            System.out.print(manufacturer);
            System.out.print(guns);
            System.out.print(numberOfMonth); // цифра [0] - Январь, 1-Февраль и т.д.
            System.out.println();
        }
    }



    }

