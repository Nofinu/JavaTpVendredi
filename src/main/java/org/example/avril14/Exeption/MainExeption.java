package org.example.avril14.Exeption;

import org.example.avril14.Exeption.PersonalExeption.MyExeption;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class MainExeption {

    static List<Integer> liste = new ArrayList<>();
    public static void main() {
        addEntry();

        try{
            if(liste.size() ==0){
                throw new MyExeption("tableau vide");
            }
            Integer somme = liste.stream().mapToInt(Integer::intValue).sum();
            System.out.println("la somme est de : "+somme);

        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void addEntry (){
        try{
            Scanner s = new Scanner(System.in);
            System.out.println("entrer une valuer pour l'ajouter a la liste ou 0 pour terminer et calculer la somme : ");
            Integer entry = s.nextInt();
            if(entry !=0){
                liste.add(entry);
                addEntry();
            }
        }
        catch (InputMismatchException e){
            System.out.println("la valeur entrer doit etre une valeure numerique !");
            addEntry();
        }

    }
}
