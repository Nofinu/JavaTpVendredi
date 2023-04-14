package org.example.avril14.Papeterie.Classes;

public class Ligne {
    private final ArticleUnitaire article;
    private final int quantite;
    private final Double prixTotal;

    public Ligne(ArticleUnitaire article, int quantite) {
        this.article = article;
        this.quantite = quantite;
        this.prixTotal = quantite * article.getPrix();
    }

    public void AfficheLigne(){
        System.out.println("quantité : "+this.quantite +" ,reference de l'article : "+this.article.getId() + " , nom de l'article : "+this.article.getNom()+" prix unitaire = "+this.article.getPrix()+" ,prix total : "+this.prixTotal );
    }

    public Double getPrixTotal() {
        return this.prixTotal;
    }

    @Override
    public String toString() {
        return "Ligne{" +
                "article=" + article +
                ", quantite=" + quantite +
                ", prixTotal=" + prixTotal +
                '}';
    }
}
