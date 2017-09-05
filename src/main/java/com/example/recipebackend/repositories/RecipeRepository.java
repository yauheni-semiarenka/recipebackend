package com.example.recipebackend.repositories;

import com.example.recipebackend.models.Recipe;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
	public List<Recipe> findAll();
}
