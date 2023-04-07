package org.example.avril07.Recette.Classes;

import org.example.avril07.Recette.Enums.EtatIngredient;
import org.example.avril07.Recette.Enums.Quantite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ingredient {
    private String nom;
    private List<EtatIngredient> status;
    private int quantite;
    private Quantite unite;
    private int id;
    private boolean cuire;
    private boolean couper;
    private static int cpt=0;

    public Ingredient(String nom, List<EtatIngredient> status, int quantite, Quantite unite,boolean cuire,boolean couper) {
        this.id = cpt ++;
        this.nom = nom;
        this.status = status;
        this.quantite = quantite;
        this.unite = unite;
        this.cuire = cuire;
        this.couper = couper;
    }

    public String getNom() {
        return nom;
    }

    public List<EtatIngredient> getStatus() {
        return status;
    }

    public void couper (){
        if(this.couper){
            this.couper = false;
            if(this.status.contains(EtatIngredient.Entier)){
                this.status.remove(EtatIngredient.Entier);
                this.status.add(EtatIngredient.Découpé);
            }
        }
        else{
            System.out.println("cette ingredients ne peu pas etre coupé");
        }
    }

    public void cuire (){
        if(this.cuire){
            this.cuire = false;
            if(this.status.contains(EtatIngredient.Cru)){
                this.status.remove(EtatIngredient.Cru);
                this.status.add(EtatIngredient.Cuit);
            }
        }
        else{
            System.out.println("cette ingredients ne peu pas etre cuit");
        }
    }


    @Override
    public String toString() {
        return "Ingredient{" +
                "nom='" + nom + '\'' +
                ", status=" + status +
                ", quantite=" + quantite +
                ", unite=" + unite +
                '}';
    }
}
