package com.example.service;

import com.example.entity.Animal;
import com.example.repository.AnimalRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**Service of the "Animals" entity.*/
@Service
public class AnimalService extends AbstractService<Animal, AnimalRepository> {

    public AnimalService(AnimalRepository repository) {
        super(repository);
    }

    @Override
    public List<Animal> readAll() {
        return repository.findAll();
    }
}
