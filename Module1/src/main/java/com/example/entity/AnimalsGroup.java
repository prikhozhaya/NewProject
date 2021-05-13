package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**A class describing groups of animals.*/
@Entity
@Table(name = "group_animals")
public class AnimalsGroup extends AbstractEntity {
    @Column
    private String nameGroup;

    @Column
    private Integer quantity;

    public String getNameGroup() {
        return nameGroup;
    }

    public void setNameGroup(String nameGroup) {
        this.nameGroup = nameGroup;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "AnimalsGroup{" +
                "name_group='" + nameGroup + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}

