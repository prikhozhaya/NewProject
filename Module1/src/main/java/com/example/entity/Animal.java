package com.example.entity;

import javax.persistence.*;

/**A class describing animals.*/
@Entity
@Table(name = "animal")
public class Animal extends AbstractEntity {
    @Column
    private String name;

    @Column
    private String weight;

    @Column
    private String height;

    @Column
    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Animal{" +
                ", name='" + name + '\'' +
                ", weight='" + weight + '\'' +
                ", height='" + height + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}

