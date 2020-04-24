package com.company;

public enum Arming {

    L11("Л-11"),
    F34("Ф-34");


    private String nameRu;



    Arming(String nameRu){
        this.nameRu = nameRu;
    }

    public String getNameRu(){
        return nameRu;
    }
}
