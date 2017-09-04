package com.example.recipebackend.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonIgnore
    private long id;
    private String name;
    private String description;
    private String imagePath;

    @OneToMany
    @JoinColumn(name = "recipeId")
    private List<Ingredient> ingredients;
}
