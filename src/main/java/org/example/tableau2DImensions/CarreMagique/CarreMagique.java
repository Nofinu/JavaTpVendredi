package org.example.tableau2DImensions.CarreMagique;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CarreMagique {
    public static void CarreMagique() {
        int[][] tab = {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}};
        int[][] value = {{0, 0},{0, 0, 0},{0, 0, 0}};
        boolean test = true;


        for (int i = 0; i < tab.length; i++) {
            value[0][0] += tab[i][i];
            value[0][1] += tab[tab.length - (i + 1)][tab.length - (i + 1)];
        }

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length ; j++) {
                value[1][i] += tab[i][j];
                value[2][i] += tab[j][i];
            }
        }

        for (int[] val:value) {
            System.out.println(Arrays.toString(val));
            for (int i = 0; i < val.length; i++) {
                if(val[i]!=15){
                    test =false;
                    break;
                }
            }
            if(!test){
                break;
            }
        }

        if(test){
            System.out.println("c'est un carre magique");
        }
        else{
            System.out.println("ce n'est pas un carre magique");
        }
    }
}
