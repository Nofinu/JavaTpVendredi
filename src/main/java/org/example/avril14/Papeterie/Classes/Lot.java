package org.example.avril14.Papeterie.Classes;

import java.util.ArrayList;
import java.util.List;

public class Lot {
    private ArticleUnitaire info ;
    private int quantite;
    private int remise;

    public Lot(ArticleUnitaire info, int quantite, int remise) {
        this.info = info;
        this.quantite = quantite;
        this.remise = remise;
    }

    public ArticleUnitaire getInfo() {
        return info;
    }

    public int getQuantite() {
        return quantite;
    }

    public int getRemise() {
        return remise;
    }
}
