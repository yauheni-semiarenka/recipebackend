package com.example.recipebackend.controllers;

import com.example.recipebackend.models.Recipe;
import com.example.recipebackend.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
public class RecipeController {
	
    @Autowired
    private RecipeService recipeService;
    
    @RequestMapping(path = "getData", method = RequestMethod.GET)
    public List<Recipe> getData() {
        return recipeService.findAll();
    }
    
    //@CrossOrigin //origins = "http://localhost:4200"
    @RequestMapping(path = "setData", method = RequestMethod.POST)
    public String setData(@RequestBody List<Recipe> recipes) {
        log.debug("List of recipe: ", recipes);
    	return "Created";
    }
}
