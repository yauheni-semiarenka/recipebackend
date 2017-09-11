package com.example.recipebackend.services.impl;

import com.example.recipebackend.models.Recipe;
import com.example.recipebackend.repositories.RecipeRepository;
import com.example.recipebackend.services.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeServiceImpl implements RecipeService {

    @Autowired
    private RecipeRepository recipeRepository;

    @Override
    public List<Recipe> findAll() {
        return this.recipeRepository.findAll();
    }
}
