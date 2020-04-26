package com.vinickiy.Recipe.controllers;

import com.vinickiy.Recipe.repositories.CategoryRepository;
import com.vinickiy.Recipe.repositories.UnitOfMeasureRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;

class IndexControllerTest {

    IndexController indexController;
    @MockBean
    CategoryRepository categoryRepository;
    @MockBean
    UnitOfMeasureRepository unitOfMeasureRepository;

    @BeforeEach
    void setUp() {
        indexController = new IndexController(categoryRepository, unitOfMeasureRepository);
    }

    @Test
    void getIndex() {
        assertEquals(indexController.getIndex(),"index");
    }
}