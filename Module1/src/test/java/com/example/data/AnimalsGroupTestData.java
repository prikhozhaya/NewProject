package com.example.data;

import com.example.entity.AnimalsGroup;

public class AnimalsGroupTestData {
    public static AnimalsGroup newAnimalsGroup() {
        AnimalsGroup animalsGroup = new AnimalsGroup();
        animalsGroup.setNameGroup("GroupName");
        animalsGroup.setQuantity(1);
        return animalsGroup;
    }
}