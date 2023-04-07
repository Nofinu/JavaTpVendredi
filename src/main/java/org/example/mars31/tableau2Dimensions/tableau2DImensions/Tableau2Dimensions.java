package org.example.mars31.tableau2Dimensions.tableau2DImensions;

public class Tableau2Dimensions {
    public static void DiagonaleMatrice (){
        int[][] tab = {{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4}};
        
        int diago1 =0;
        int diago2 =0;

        for (int i = 0; i < tab.length; i++) {
            diago1 += tab[i][i];
            diago2 += tab[tab.length-(i+1)][tab.length-(i+1)];

        }
        System.out.println("diago1 : "+diago1);
        System.out.println("diago2 : "+diago2);
    }
}
