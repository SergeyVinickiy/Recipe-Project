package com.vinickiy.Recipe.controllers;


import com.vinickiy.Recipe.domain.Category;
import com.vinickiy.Recipe.domain.UnitOfMeasure;
import com.vinickiy.Recipe.repositories.CategoryRepository;
import com.vinickiy.Recipe.repositories.UnitOfMeasureRepository;
import jdk.nashorn.internal.runtime.options.Option;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndex(){

        return "index";
    }
}
