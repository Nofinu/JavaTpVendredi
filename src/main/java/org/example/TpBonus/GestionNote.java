package org.example.TpBonus;

import java.util.Scanner;

public class GestionNote {

    public static void gestionNote(){
        Scanner s = new Scanner(System.in);
        int entry;
        int[] tabnote = new int[10];

        do {
            affichageMenu();
            entry = s.nextInt();

            switch (entry){
                case 1:
                    tabnote = enregistreNote();
                    break;

                case 2:

                   afficherNotes(tabnote);
                    break;

                case 3:
                    tabnote = modifNote(tabnote);
                    break;

                case 4:
                    mean(tabnote);
                    break;

                case 5:
                    noteMax(tabnote);
                    break;

                case 6:
                    noteMin(tabnote);
                    break;
            }

        }while (entry !=0);
    }

    public static void affichageMenu (){
        System.out.println(" ");
        System.out.println("1-Stockerlesnotesdesélèvesdansuntableau.");
        System.out.println("2-Afficherla listedesnotes");
        System.out.println("3-Modifierune note");
        System.out.println("4-Afficher la moyenne de la classe.");
        System.out.println("5-Afficherlanotelaplusélevée.");
        System.out.println("6-Afficherlanotelaplusbase.");
        System.out.println("0-Quitterleprogramme");
        System.out.println("Entrer une valeur :");
    }

    public static void afficherNotes(int[] tab){
        for (int i = 0; i < tab.length; i++) {
            System.out.println("note n°"+(i+1)+" : "+tab[i]);
        }
    }

    public static void noteMax(int[]tab){
        int noteMax=0;
        for (int j : tab) {
            if (j > noteMax) {
                noteMax = j;
            }
        }
        System.out.println("la note maximal vaut : "+noteMax);
    }
    public static void noteMin(int[]tab){
        int noteMin=20;
        for (int j : tab) {
            if (j < noteMin) {
                noteMin = j;
            }
        }
        System.out.println("la note maximal vaut : "+noteMin);
    }

    public static void mean (int[] tab){
        int somme = 0;
        for (int j : tab) {
            somme += j;
        }
        float mean =somme/tab.length;
        System.out.println("la moyenne vaut : "+mean);
    }

    public static int[] modifNote (int[] tab){
        Scanner s = new Scanner(System.in);
        System.out.println("quelnote vouler vous modifier ? :");
        int entry = s.nextInt();
        System.out.println("la note n° "+entry+" vaut "+tab[entry] );
        System.out.println("A combien voulez vous la modifier ? :");
        int note = s.nextInt();
        tab[entry] = note;
        return tab;
    }
    public static int[] enregistreNote(){
        Scanner s = new Scanner(System.in);
        System.out.println("combien de note voulez vous rentrer");
        int value = s.nextInt();
        int[] tab = new int[value];

        for (int i = 0; i < tab.length; i++) {
            System.out.println("entrer la "+(i+1)+" eme note :");
            tab[i] = s.nextInt();
        }

        return tab;
    }
}
