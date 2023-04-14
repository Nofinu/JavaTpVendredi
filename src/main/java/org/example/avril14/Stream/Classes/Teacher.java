package org.example.avril14.Stream.Classes;

public class Teacher {
    private int id;
    private String name;
    private String departement;
    private int stratDate;
    private static int cpt =1;

    public Teacher(String name, String departement, int stratDate) {
        this.id = cpt++;
        this.name = name;
        this.departement = departement;
        this.stratDate = stratDate;
    }

    public String getName() {
        return name;
    }

    public String getDepartement() {
        return departement;
    }

    public int getStratDate() {
        return stratDate;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", departement='" + departement + '\'' +
                ", stratDate=" + stratDate +
                '}';
    }
}
