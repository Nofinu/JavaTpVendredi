package org.example.avril14.Papeterie.Classes;

public class Stylo extends ArticleUnitaire {

    private String couleur;

    public Stylo(String nom, Double prix, String couleur) {
        super(nom, prix);
        this.couleur = couleur;
    }

    public String getCouleur() {
        return couleur;
    }

    @Override
    public String toString() {
        return "Stylo{" +
                "couleur='" + couleur + '\'' +
                '}';
    }
}
