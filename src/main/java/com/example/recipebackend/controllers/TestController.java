package com.example.recipebackend.controllers;

import com.example.recipebackend.models.Recipe;
import com.example.recipebackend.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    private RecipeRepository recipeRepository;

    @RequestMapping(path = "getData")
    public List<Recipe> getData() {
        return (List<Recipe>)  recipeRepository.findAll();
    }
}
