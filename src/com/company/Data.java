package com.company;

public class Data {

    protected Object[] data; // Масив, который будет хранить в себе все строки таблицы

    // каждая строка таблицы это объект
    Tank line1 = new Line(Manufacturer.KHARKIV, Arming.L11, new int[] {166, 85, 17, 0, 0, 0});
    Tank line2 = new Line(Manufacturer.KHARKIV, Arming.F34, new int[] {0, 0, 117, 140, 121, 170});
    Tank line3 = new Line(Manufacturer.STALINGRAD, Arming.L11, new int[] {2, 28, 45, 0, 0, 0});
    Tank line4 = new Line(Manufacturer.STALINGRAD, Arming.F34, new int[] {0, 0, 0, 63, 70, 86});


    public Data() {//собираю данные в кучу
        data = new Object[] { line1, line2, line3, line4 };
    }

    public void printData(){ //распечатка всей кучи
        for (Object x : data){
            System.out.println(x.toString());
        }
    }

    public Object getData (){
        return data;
    }
}
