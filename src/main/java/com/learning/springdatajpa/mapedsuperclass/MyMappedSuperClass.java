package com.learning.springdatajpa.mapedsuperclass;

import jakarta.persistence.Entity;

@Entity
public class MyMappedSuperClass extends BaseEntity{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
