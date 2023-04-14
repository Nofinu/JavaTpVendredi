package org.example.avril14.Papeterie.Classes;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.SimpleTimeZone;

public class Storage {
    private Map<Integer,ArticleUnitaire> stock = new HashMap<>();

    public Storage() {
    }


    public void AddStylo(String nom, Double prix , String couleur){
        Stylo stylo = new Stylo(nom,prix,couleur);
        this.stock.put(stylo.getId(),stylo);
    }

    public void AddRamette(String nom, Double prix , Double grammage){
        Ramette ramette = new Ramette(nom,prix,grammage);
        this.stock.put(ramette.getId(),ramette);
    }

    public ArticleUnitaire recupArticle (Integer id){
        return stock.get(id);
    }
}
