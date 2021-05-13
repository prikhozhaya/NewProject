package com.example.controller;

import com.example.service.AnimalService;
import com.example.data.AnimalTestData;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.Collections;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

class AnimalControllerTest {

    MockMvc mockMvc;
    ObjectMapper objectMapper;
    AnimalService animalService;

    @BeforeEach
    void setUp() {
        animalService = mock(AnimalService.class);
        mockMvc = MockMvcBuilders.standaloneSetup(new AnimalController(animalService)).build();
        objectMapper = new ObjectMapper();
    }

    @Test
    void getAll() throws Exception {
        when(animalService.readAll()).thenReturn(Collections.singletonList(AnimalTestData.newAnimal()));
        mockMvc.perform(get("/example.com/animal/all")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(content().json(objectMapper.writeValueAsString(Collections.singletonList(AnimalTestData.newAnimal()))))
                .andExpect(status().isOk());
    }
}