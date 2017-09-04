package com.example.recipebackend.repository;

import com.example.recipebackend.models.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}
