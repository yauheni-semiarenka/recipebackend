package com.example.recipebackend.services;

import java.util.List;

import com.example.recipebackend.models.Recipe;

public interface RecipeService {
	public List<Recipe> findAll();
}
