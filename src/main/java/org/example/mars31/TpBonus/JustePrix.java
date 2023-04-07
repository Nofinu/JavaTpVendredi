package org.example.mars31.TpBonus;

import java.util.Random;
import java.util.Scanner;

public class JustePrix {
    public static void  JustePrix (){
        Random rndm = new Random();
        Scanner s = new Scanner(System.in);

        int value = rndm.nextInt(1000);
        int entry=-1;
        System.out.println(value);
        System.out.println("essayer de deviner une valeur entre 0 et 1000");

        do{
            System.out.println("entrer une valeur");
            entry = s.nextInt();
            if (entry < value){
                System.out.println("vous etes en dessous du prix rechercher");
            }
            if (entry> value){
                System.out.println("vous etes au dessus du prix rechercher");
            }
        }while (entry!=value);

        System.out.println("bravo vous avez trouver la valeur : "+value);
    }
}
