package org.example.TpBonus;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Pendu {

    static int essais = 10;
    public static void Pendu (){
        Random rmdn = new Random();
        Scanner s = new Scanner(System.in);

        char[][] listeMots = {{'m','o','t','s'},{'p','e','n','d','u'},{'j','e','u','x'}};
        int motnbr = rmdn.nextInt(listeMots.length);
        char[] mot = new char[listeMots[motnbr].length];
        boolean testVictory = false;

        for (int i = 0; i < listeMots[motnbr].length; i++) {
            mot[i] = '*';
        }


        do {
            affichage(mot);
            System.out.println("entrer une lettre");
            String entry = s.next();
            char[][] tabrecup = testLettre(mot,listeMots[motnbr],entry);
            mot = tabrecup[0];
            listeMots[motnbr] = tabrecup[1];

            testVictory = testVictore(mot);

        }while (!testVictory && essais>0);

    }

    public static char[][] testLettre (char[] mot, char[] motaDeviner, String lettre){
        String untruc = Arrays.toString(motaDeviner);
        if(untruc.contains(lettre)){
            for (int i = 0; i < motaDeviner.length; i++) {
                if(motaDeviner[i] == lettre.charAt(0)){
                    motaDeviner[i] ='*';
                    mot[i]=lettre.charAt(0);
                }
            }

        }else{
            essais --;
        }
        char [][] returntab ={mot,motaDeviner};
        return returntab;
    }

    public static void affichage (char[]tab){
        for (int i = 0; i < tab.length-1; i++) {
            System.out.print(tab[i]);
        }
        System.out.println(tab[tab.length-1]);
    }

    public static boolean testVictore (char[] tab){
        boolean test =true;
        for (int i = 0; i < tab.length; i++) {
            if(tab[i] == '*'){
                test=false;
                break;
            }
        }
        return test;
    }
}
