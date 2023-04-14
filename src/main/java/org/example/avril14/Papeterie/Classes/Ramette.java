package org.example.avril14.Papeterie.Classes;

public class Ramette extends ArticleUnitaire {

    private Double grammage;

    public Ramette(String nom, Double prix, Double grammage) {
        super(nom, prix);
        this.grammage = grammage;
    }

    public Double getGrammage() {
        return grammage;
    }

    @Override
    public String toString() {
        return "Ramette{" +
                "grammage=" + grammage +
                '}';
    }
}
