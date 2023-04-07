package org.example.avril07.ONF;

import org.example.avril07.ONF.Classes.ONFData;
import org.example.avril07.ONF.Classes.Parcelle;
import org.example.avril07.ONF.Enums.TypeArbre;

import java.util.List;

public class MainONF {

    public static void main() {
        ONFData onf = new ONFData();
        onf.setSurface(new Parcelle());
        List<Parcelle> surface = onf.getSurface();
        Parcelle parcelle1 = surface.get(0);
        parcelle1.creeArbre(TypeArbre.Feuillu,150,25);
        System.out.println(parcelle1.nombreArbres());
    }


}
