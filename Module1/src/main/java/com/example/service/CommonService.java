package com.example.service;

import com.example.entity.AbstractEntity;

import java.util.List;

public interface CommonService <E extends AbstractEntity>{
    List<E> readAll();
}