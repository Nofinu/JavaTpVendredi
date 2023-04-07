package org.example.avril07.Recette;

import org.example.avril07.Recette.Classes.Ingredient;
import org.example.avril07.Recette.Classes.Plat;
import org.example.avril07.Recette.Enums.EtatIngredient;
import org.example.avril07.Recette.Enums.Quantite;

import java.sql.SQLOutput;
import java.util.List;

public class MainRecettes {


    public static void main() {
        Plat plat1 = new Plat("Choucroute");
        plat1.addIngredients(new Ingredient("Choucroute",  List.of(EtatIngredient.Cuit),500, Quantite.gramme,false,false));
        plat1.addIngredients(new Ingredient("Lard",List.of(EtatIngredient.Cuit,EtatIngredient.Entier),150,Quantite.gramme,false,false));
        plat1.addIngredients(new Ingredient("Saucisses",List.of( EtatIngredient.Cuit,EtatIngredient.Entier),2,Quantite.Unite,false,false));
        System.out.println(plat1);

        Plat plat2 = new Plat("Choucroute");
        plat2.addIngredients(new Ingredient("Choucroute",List.of(EtatIngredient.Cuit),300, Quantite.gramme,false,false));
        plat2.addIngredients(new Ingredient("Lard",List.of(EtatIngredient.Cuit,EtatIngredient.Entier),20,Quantite.gramme,false,false));
        plat2.addIngredients(new Ingredient("Saucisses",List.of( EtatIngredient.Cuit,EtatIngredient.Entier),24,Quantite.Unite,false,false));

        System.out.println(plat1.equals(plat2));
    }

}
