package org.example.avril07.ONF.Classes;

import org.example.avril07.ONF.Enums.TypeArbre;

import java.util.List;

public class Parcelle {
    private List<Arbre> arbres;
    private int parcelle ;
    private  static int cpt=0;

    public Parcelle() {
        this.parcelle = cpt++;
    }

    public void creeArbre(TypeArbre type,int hauteur,int diametre){
        this.arbres.add(new Arbre(type,hauteur,diametre));
    }

    public int nombreArbres(){
        return arbres.size();
    }

}
