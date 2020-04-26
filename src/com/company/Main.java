package com.company;

import java.util.Calendar;

public class Main {

    public static void main(String[] args) {
        Tank line0 = new T34(Manufacturer.KHARKIV, Arming.L11, new int[]{166, 85, 17, 0, 0, 0});
        Tank line1 = new T34(Manufacturer.KHARKIV, Arming.F34, new int[]{0, 0, 117, 140, 121, 170});
        Tank line2 = new T34(Manufacturer.STALINGRAD, Arming.L11, new int[]{2, 28, 45, 0, 0, 0});
        Tank line3 = new T34(Manufacturer.STALINGRAD, Arming.F34, new int[]{0, 0, 0, 63, 70, 86});

        Object[] line;
        line = new Object[]{line0, line1, line2, line3};

//        System.out.println(line[1]);

        for (Object x : line) {
            Column((T34) x);
        }
//        monthColumn((T34) line[0]);

    }

    public static void Column(T34 line) {
        System.out.print(line.nameManufacturer.getNameRU() + "|");
        System.out.print(line.arming.getNameRu() +  "|");
        System.out.print(line.numberOfMonth[0] + "|"); // цифра [0] - Январь, 1-Февраль и т.д.
        System.out.println();
         }
}

