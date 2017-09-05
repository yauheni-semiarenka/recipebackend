package com.example.recipebackend.controllers;

import com.example.recipebackend.models.Ingredient;
import com.example.recipebackend.models.Recipe;
import com.example.recipebackend.repositories.RecipeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RecipeController {

//	private static final Logger log = LoggerFactory.getLogger(RecipeController.class);
	
    @Autowired
    private RecipeRepository recipeRepository;

    @RequestMapping(path = "getData", method = RequestMethod.GET)
    public List<Recipe> getData() {
//    	List<Ingredient> ingredients = new ArrayList<Ingredient>();
//    	ingredients.add(new Ingredient());
//    	Recipe recipe = new Recipe();
//    	recipe.setId(15);
//    	recipe.setName("Name");
//    	recipe.setDescription("");
//    	recipe.setImagePath("");
//    	recipe.setIngredients(ingredients);
//    	recipeRepository.save(recipe);
        return recipeRepository.findAll();
    }
    
    @CrossOrigin //origins = "http://localhost:4200"
    @RequestMapping(path = "setData", method = RequestMethod.POST)
    public String setData(@RequestBody List<Recipe> recipes) {
//    	log.info("recipes= ", recipes);
//    	recipeRepository.deleteAll();
//    	recipeRepository.save(recipes);
    	recipeRepository.save(recipes);
    	return "Created";
    }
}
