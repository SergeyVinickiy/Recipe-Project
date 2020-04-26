package com.vinickiy.Recipe.bootstrap;

import com.vinickiy.Recipe.domain.Ingredient;
import com.vinickiy.Recipe.domain.Recipe;
import com.vinickiy.Recipe.domain.UnitOfMeasure;
import com.vinickiy.Recipe.repositories.CategoryRepository;
import com.vinickiy.Recipe.repositories.IngredientRepository;
import com.vinickiy.Recipe.repositories.RecipeRepository;
import com.vinickiy.Recipe.repositories.UnitOfMeasureRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class DataLoader implements CommandLineRunner {

private CategoryRepository categoryRepository;
private RecipeRepository recipeRepository;
private UnitOfMeasureRepository unitOfMeasureRepository;
private IngredientRepository ingredientRepository;

    public DataLoader(CategoryRepository categoryRepository, RecipeRepository recipeRepository,
                      UnitOfMeasureRepository unitOfMeasureRepository, IngredientRepository ingredientRepository) {
        this.categoryRepository = categoryRepository;
        this.recipeRepository = recipeRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
        this.ingredientRepository = ingredientRepository;
    }


    @Override
    public void run(String... args) throws Exception {

        Recipe guackomoliRecipe = new Recipe();
        guackomoliRecipe.setCookTime(15);
        guackomoliRecipe.setDescription("Be careful handling chiles if using. Wash your hands thoroughly after handling and do not touch your eyes or the area near your eyes with your hands for several hours.");
        guackomoliRecipe.setServings(4);

        Ingredient avokado = new Ingredient();
        avokado.setRecipe(guackomoliRecipe);
        UnitOfMeasure avokadoUnit = new UnitOfMeasure();
        avokadoUnit.setDescription("ehidot");
        avokado.setUnitOfMeasure(avokadoUnit);
        Ingredient savedAvokado = ingredientRepository.save(avokado);

        Ingredient beica = new Ingredient();
        beica.setRecipe(guackomoliRecipe);
        UnitOfMeasure beicaUnit = new UnitOfMeasure();
        beicaUnit.setDescription("ehidot");
        beica.setUnitOfMeasure(beicaUnit);
        Ingredient savedBeica = ingredientRepository.save(beica);

        Set<Ingredient> ingredients = new HashSet<>();
        ingredients.add(savedAvokado);
        ingredients.add(savedBeica);
        guackomoliRecipe.setIngredients(ingredients);



    }
}
