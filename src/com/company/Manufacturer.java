package com.company;

public enum Manufacturer {
    KHARKIV ("№ 183 (Харьков)"),
    STALINGRAD("СТЗ (Сталинград)");

    private String nameRu;

    Manufacturer (String nameRu){
        this.nameRu = nameRu;
    }

    public String getNameRU(){
        return nameRu;
    }

}
