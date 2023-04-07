package org.example.avril07.Elus.Classes;

import java.util.ArrayList;
import java.util.List;

public class Elu extends Personne{
    protected List<Personne> assistants = new ArrayList<>();

    public void embaucher (Personne assistant){
        this.assistants.add(assistant);
    }

    public void licencier (String nom,String prenom){
        for (Personne a:this.assistants) {
            if(a.getNom().equals(nom) && a.getPrenom().equals(prenom)){
                this.assistants.remove(a);
            }
        }
    }

    public void donationBudgetaire (int somme){
        int sommeAssistant = somme/this.assistants.size();
        for (Personne a:this.assistants) {
            a.addSous(sommeAssistant);
        }
    }
}
