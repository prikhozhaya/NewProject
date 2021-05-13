package com.example.controller;

import com.example.entity.Animal;
import com.example.service.AnimalService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**Controller of the "Animals" entity.*/
@Controller
@RequestMapping("/example.com/animal")
public class AnimalController extends AbstractController<Animal, AnimalService>{

    protected AnimalController(AnimalService service) {
        super(service);
    }

    /**
     *Retrieves information about animals from the Database.
     *
     * @return List of animals.
     */
    @Override
    @GetMapping("/all")
    public ResponseEntity<List<Animal>> getAll() {
        List<Animal> product = service.readAll();
        return new ResponseEntity<List<Animal>>(product, HttpStatus.OK);
    }
}

