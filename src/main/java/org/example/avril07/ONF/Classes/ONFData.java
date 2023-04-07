package org.example.avril07.ONF.Classes;


import java.util.ArrayList;
import java.util.List;

public class ONFData {
    private List<Parcelle> surface =new ArrayList<>();

    public ONFData() {
    }

    public List<Parcelle> getSurface() {
        return surface;
    }

    public void setSurface(Parcelle parcelle) {
        this.surface.add(parcelle);
    }
}
