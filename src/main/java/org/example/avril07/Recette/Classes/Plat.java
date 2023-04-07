package org.example.avril07.Recette.Classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Plat {
    private String nom;
    private List<Ingredient> ingredients = new ArrayList<>();

    public Plat(String nom) {
        this.nom = nom;
    }

    public void addIngredients(Ingredient ingredients) {
        this.ingredients.add(ingredients);
    }

    @Override
    public String toString() {
        return "Plat{" +
                "nom='" + nom + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Plat plat = (Plat) obj;
        boolean test =true;
        int size;
        if(this.ingredients.size() < ((Plat) obj).ingredients.size()){
            size = this.ingredients.size();
        }
        else{
            size= ((Plat) obj).ingredients.size();
        }
        for (int i = 0; i <size ; i++) {
                Ingredient ingre= this.ingredients.get(i);
                Ingredient ingredientPlat = ((Plat) obj).ingredients.get(i);
                if(!Objects.equals(ingre.getNom(),ingredientPlat.getNom()) || !ingre.getStatus().equals(ingredientPlat.getStatus())){
                    test = false;
                    break;
                }
                if (!test){
                    break;
                }

        }
        return test;
    }
}
