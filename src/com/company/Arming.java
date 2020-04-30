package com.company;

import java.util.Calendar;

public class Arming extends Tank { //Выпуск Вооружения
    public static String manufactureHead = "ПРОИЗВОДИТЕЛЬ";
    public static final int WIDTH_MANUFACTURE = 20; //шапка таблицы ширина колонки производитель
    public static String gunsHead = "ВООРУЖЕНИЕ";
    public static final int WIDTH_GUNS = 15; //ширина колонки вооружение
    public static String lineHead = "|";
    public static final int WIDTH_MONTHS = 9; // ширирана колонки месяц
    public static String m = "Название мессяца";
    public static int sumNumberOfMonth; // сколько всего вооружения за выбранный месяц
    public static final String TOTAL = "ВСЕГО";

    public Arming(Manufacturer nameManufacturer, Guns guns, int[] numberOfMonth) {
        super(nameManufacturer, guns, numberOfMonth);
    }


    public static void createTable(int month) {

        Tank arming1 = new Arming(Manufacturer.KHARKIV, Guns.L11, new int[]{166, 85, 17, 0, 0, 0}); //создаю объекты вооружения
        Tank arming2 = new Arming(Manufacturer.KHARKIV, Guns.F34, new int[]{0, 0, 117, 140, 121, 170});// в массиве указываю количество
        Tank arming3 = new Arming(Manufacturer.STALINGRAD, Guns.L11, new int[]{2, 28, 45, 0, 0, 0}); // вооружения по месяцам, как в
        Tank arming4 = new Arming(Manufacturer.STALINGRAD, Guns.F34, new int[]{0, 0, 0, 63, 70, 86});// таблице

        Object[] arming; // и запихиваем их в массив
        arming = new Object[]{arming1, arming2, arming3, arming4};


        switch (month) {
            case (Calendar.JANUARY):
                m = "Январь";
                break;
            case (Calendar.FEBRUARY):
                m = "Февраль";
                break;
            case (Calendar.MARCH):
                m = "Март";
                break;
            case (Calendar.APRIL):
                m = "Апрель";
                break;
            case (Calendar.MAY):
                m = "Май";
                break;
            case (Calendar.JUNE):
                m = "Июнь";
                break;
            default:
                System.out.println("Выбери месяц в промежутке с Янврая по Июнь ");


        } // в колонке таблицы будет указываться выбранный месяц

        //рисую шапку таблицы
        System.out.print(lineHead + manufactureHead);
        for (int i = lineHead.length() + manufactureHead.length(); i < WIDTH_MANUFACTURE; i++) {
            System.out.print(" ");
        }

        System.out.print(lineHead + gunsHead);
        for (int i = lineHead.length() + gunsHead.length(); i < WIDTH_GUNS; i++) {
            System.out.print(" ");
        }

        System.out.print(lineHead + m);
        for (int i = lineHead.length() + m.length(); i < WIDTH_MONTHS; i++) {
            System.out.print(" ");
        }
        System.out.println(lineHead);

        for (int i = 0; i <= WIDTH_MANUFACTURE + WIDTH_GUNS + WIDTH_MONTHS; i++) {
            System.out.print("=");
        }

        System.out.println();

        //вывожу строки сформированной таблицы
        for (Object x : arming) {
            columnMonth((Tank) x, month);
        }

        //подсчитываю конечный резульатат сколько вооружения ВСЕГО за выбранный месяц
        for (int i = 0; i < WIDTH_MANUFACTURE; i++) {
            System.out.print(" ");
        }
        System.out.print(TOTAL);

        for (int i = TOTAL.length(); i <= WIDTH_GUNS; i++) {
            System.out.print(" ");
        }
        System.out.println(sumNumberOfMonth);
    }


    public static void columnMonth(Tank arming, int month) { // печатает столбец по выранному месяцу


        String manufacturer = arming.nameManufacturer.getNameRU();
        String guns = arming.guns.getNameRu();
        String numberOfMonth = arming.numberOfMonth[month] + "";


        if (arming.numberOfMonth[month] > 0) {


            System.out.print(lineHead + manufacturer);
            for (int i = lineHead.length() + manufacturer.length(); i < WIDTH_MANUFACTURE; i++) {
                System.out.print(" ");
            }

            System.out.print(lineHead + guns);
            for (int i = lineHead.length() + guns.length(); i < WIDTH_GUNS; i++) {
                System.out.print(" ");
            }

            System.out.print(lineHead + numberOfMonth);
            sumNumberOfMonth += arming.numberOfMonth[month];
            for (int i = lineHead.length() + numberOfMonth.length(); i < WIDTH_MONTHS; i++) {
                System.out.print(" ");
            }
            System.out.println(lineHead);

            for (int i = 0; i <= WIDTH_MANUFACTURE + WIDTH_GUNS + WIDTH_MONTHS; i++) {
                System.out.print("=");
            }
            System.out.println();


        }
    }


}

