package com.example.controller;

import com.example.service.AnimalsGroupService;
import com.example.data.AnimalsGroupTestData;
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

class AnimalsGroupControllerTest {

    MockMvc mockMvc;
    ObjectMapper objectMapper;
    AnimalsGroupService animalsGroupService;

    @BeforeEach
    void setUp() {
        animalsGroupService = mock(AnimalsGroupService.class);
        mockMvc = MockMvcBuilders.standaloneSetup(new AnimalsGroupController(animalsGroupService)).build();
        objectMapper = new ObjectMapper();
    }

    @Test
    void getAll() throws Exception {
        when(animalsGroupService.readAll()).thenReturn(Collections.singletonList(AnimalsGroupTestData.newAnimalsGroup()));
        mockMvc.perform(get("/example.com/group/all")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(content().json(objectMapper.writeValueAsString(Collections.singletonList(AnimalsGroupTestData.newAnimalsGroup()))))
                .andExpect(status().isOk());
    }
}