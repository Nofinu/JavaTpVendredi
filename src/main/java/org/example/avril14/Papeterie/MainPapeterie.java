package org.example.avril14.Papeterie;

import org.example.avril14.Papeterie.Classes.Facture;
import org.example.avril14.Papeterie.Classes.Storage;
import org.example.avril14.Papeterie.Classes.Stylo;

public class MainPapeterie {
    public static void main() {
        Storage stock = new Storage();
        stock.AddStylo("StyloBleu",1.99,"Bleu");
        stock.AddRamette("papierBlanc",25.35,0.80);

        Facture facture1 = new Facture("client1","14/04/2023");
        facture1.setLigne(stock.recupArticle(1),10);
        facture1.setLigne(stock.recupArticle(2),5 );
        facture1.affichagefacture();

    }
}
