package com.example.service;

import com.example.entity.AnimalsGroup;
import com.example.repository.AnimalsGroupRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**Service of the "Animals Group" entity.*/
@Service
public class AnimalsGroupService extends AbstractService<AnimalsGroup, AnimalsGroupRepository> {

    public AnimalsGroupService(AnimalsGroupRepository repository) {
        super(repository);
    }

    @Override
    public List<AnimalsGroup> readAll() {
        return repository.findAll();
    }
}
