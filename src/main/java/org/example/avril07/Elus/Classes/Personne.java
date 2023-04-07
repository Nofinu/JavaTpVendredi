package org.example.avril07.Elus.Classes;

public class Personne {
    private String nom,prenom;
    private int compteBancaire;

    public Personne() {
    }

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void addSous (int montant){
        this.compteBancaire += montant;
    }
}
