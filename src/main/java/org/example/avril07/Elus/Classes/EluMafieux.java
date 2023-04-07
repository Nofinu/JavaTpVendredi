package org.example.avril07.Elus.Classes;

public class EluMafieux extends Elu{
    @Override
    public void embaucher(Personne assistant) {
        if(assistant.getNom().equals(this.getNom())){
            this.assistants.add(assistant);
        }
    }
}
