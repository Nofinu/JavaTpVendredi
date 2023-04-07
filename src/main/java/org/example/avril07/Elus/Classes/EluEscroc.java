package org.example.avril07.Elus.Classes;

public class EluEscroc extends Elu {
    private int compteSuisse=0;

    @Override
    public void donationBudgetaire(int somme) {
        int sommeAssistant = somme/this.assistants.size();
        if(sommeAssistant>1480){
            sommeAssistant = 1480;
        }
        for (Personne a:this.assistants) {
            a.addSous(sommeAssistant);
            somme -=sommeAssistant;
        }
        compteSuisse += somme;
    }
}
