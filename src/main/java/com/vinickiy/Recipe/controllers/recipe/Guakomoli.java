package com.vinickiy.Recipe.controllers.recipe;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Guakomoli {

    @RequestMapping({"recipe/","recipe/recipe", "recipe/recipe.html"})
    public String getGuakomoli(){

        return "recipe/recipe";
    }


}
