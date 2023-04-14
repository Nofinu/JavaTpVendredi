package org.example.avril14.Papeterie.Classes;

public abstract class ArticleUnitaire {
    protected Integer id;
    protected String nom;
    protected Double prix;

    public static int cpt = 1;

    public ArticleUnitaire(String nom, Double prix) {
        this.id = cpt++;
        this.nom = nom;
        this.prix = prix;
    }

    public ArticleUnitaire() {
    }

    public Integer getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public Double getPrix() {
        return prix;
    }

    @Override
    public String toString() {
        return "ArticleUnitaire{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prix=" + prix +
                '}';
    }
}
