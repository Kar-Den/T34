package com.company;

public enum Guns {

    L11("Л-11"),
    F34("Ф-34");


    private String nameRu;



    Guns(String nameRu){
        this.nameRu = nameRu;
    }

    public String getNameRu(){
        return nameRu;
    }
}
