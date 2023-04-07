package org.example.avril07.ONF.Classes;


import java.util.List;

public class ONFData {
    private List<Parcelle> surface;

    public ONFData() {
    }

    public void setSurface(Parcelle parcelle) {
        this.surface.add(parcelle);

    }
}
