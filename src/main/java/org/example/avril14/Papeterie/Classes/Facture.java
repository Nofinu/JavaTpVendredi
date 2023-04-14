package org.example.avril14.Papeterie.Classes;

import java.net.http.WebSocket;
import java.util.ArrayList;
import java.util.List;

public class Facture {
    private String client;
    private String date;
    private List<Ligne> ligne = new ArrayList<>();

    private Double prixTotal = 0d;

    public Facture(String client, String date) {
        this.client = client;
        this.date = date;
    }

    public void setLigne(ArticleUnitaire article , Integer quantite) {
        Ligne ligne = new Ligne(article,quantite);
        this.ligne.add(ligne);
        System.out.println(ligne);
        this.prixTotal += ligne.getPrixTotal();

    }


    public void affichagefacture (){
        System.out.println("----------Facture------------");
        System.out.println("date : "+this.date);
        System.out.println(this.client);
        System.out.println("---------------------");
        this.ligne.stream().forEach(Ligne::AfficheLigne);
        System.out.println("---------------------");
        System.out.println("total : "+this.prixTotal+" €");

    }

    @Override
    public String toString() {
        return "Facture{" +
                "client='" + client + '\'' +
                ", date='" + date + '\'' +
                ", ligne=" + ligne +
                ", prixTotal=" + prixTotal +
                '}';
    }
}
