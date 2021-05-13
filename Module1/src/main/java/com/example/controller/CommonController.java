package com.example.controller;

import com.example.entity.AbstractEntity;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CommonController<E extends AbstractEntity> {
    ResponseEntity<List<E>> getAll();
}