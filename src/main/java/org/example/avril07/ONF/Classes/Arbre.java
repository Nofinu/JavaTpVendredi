package org.example.avril07.ONF.Classes;

import org.example.avril07.ONF.Enums.TypeArbre;

public class Arbre {
    private TypeArbre typeArbre;
    private int hauteur,diametre;
    private int id;
    private static int cpt =0;

    public Arbre(TypeArbre typeArbre, int hauteur, int diametre) {
        this.id = cpt++;
        this.typeArbre = typeArbre;
        this.hauteur = hauteur;
        this.diametre = diametre;
    }
}
