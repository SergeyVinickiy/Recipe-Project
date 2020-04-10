package com.vinickiy.Recipe.repositories;

import com.vinickiy.Recipe.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {



}
