package org.example.mars31.tableau2Dimensions.tableau2DImensions.tableauRegulier;

public class TableauRegulier {

    public static void testtab (){
        int[][] tab = {{1,2,3},{1,2,3},{1,2,3},{1,2}};

        System.out.println(estRegulier(tab));
    }

    public static void doubleRegulier(){
        int[][] tab1 ={{1,2,3},{1,2,3},{1,2,3},{1,2,3}};
        int[][] tab2 ={{1,2,3},{1,2,3},{1,2,3}};

        if(tab1.length == tab2.length){
            if(estRegulier(tab1) && estRegulier(tab2)){
                System.out.println("les 2 tableaux sont regulier est de meme taille");
            }
            else{
                System.out.println("les 2 tableaux ne sont pas regulier");
            }
        }else {
            System.out.println("les 2 tableau ne sont pas de meme taille");
        }
    }
    public static boolean estRegulier (int[][] tab){

        int rowLength = tab[0].length;
        boolean test = true;
        for (int i = 1; i < tab.length; i++) {
            if(tab[i].length != rowLength){
                test =false;
                break;
            }
        }

        return test;
    }
}
