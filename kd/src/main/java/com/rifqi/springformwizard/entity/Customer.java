package com.rifqi.springformwizard.entity;

import java.io.Serializable;


public class Customer implements Serializable{
    private String name;
    private String nim;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    
    
}
