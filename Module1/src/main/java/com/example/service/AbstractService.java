package com.example.service;

import com.example.entity.AbstractEntity;
import com.example.repository.CommonRepository;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractService<E extends AbstractEntity, R extends CommonRepository<E>>
        implements CommonService<E> {

    protected final R repository;

    @Autowired
    public AbstractService(R repository) {
        this.repository = repository;
    }

}
