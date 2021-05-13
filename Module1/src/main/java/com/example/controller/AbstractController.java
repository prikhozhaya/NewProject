package com.example.controller;

import com.example.entity.AbstractEntity;
import com.example.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractController<E extends AbstractEntity, S extends CommonService<E>>
        implements CommonController<E> {

    protected final S service;

    @Autowired
    protected AbstractController(S service) {
        this.service = service;
    }

}
