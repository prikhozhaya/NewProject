package com.example.controller;

import com.example.entity.AnimalsGroup;
import com.example.service.AnimalsGroupService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**Controller of the "Animals Group" entity.*/
@Controller
@RequestMapping("/example.com/group")
public class AnimalsGroupController extends AbstractController<AnimalsGroup, AnimalsGroupService>{

    protected AnimalsGroupController(AnimalsGroupService service) {
        super(service);
    }

    /**
     *Retrieves information about animals group from the Database.
     *
     * @return List of animals group.
     */
    @Override
    @GetMapping("/all")
    public ResponseEntity<List<AnimalsGroup>> getAll() {
        List<AnimalsGroup> product = service.readAll();
        return new ResponseEntity<List<AnimalsGroup>>(product, HttpStatus.OK);
    }
}

