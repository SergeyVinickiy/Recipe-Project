package com.vinickiy.Recipe.repositories;

import com.vinickiy.Recipe.domain.Ingredient;
import org.springframework.data.repository.CrudRepository;

public interface IngredientRepository  extends CrudRepository<Ingredient, Long> {
}
