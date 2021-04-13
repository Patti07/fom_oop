package fom.oop.v5.task_08_02;

public class Produkt {

    private String name;
    private int tiefe;
    private int hoehe;
    private int breite;
    private int gewicht;

    public Produkt(String name, int tiefe, int hoehe, int breite, int gewicht) {
        this.name = name;
        this.tiefe = tiefe;
        this.hoehe = hoehe;
        this.breite = breite;
        this.gewicht = gewicht;
    }

    public void print() {
        System.out.println();
        System.out.println("Name                        : " + this.name);
        System.out.println("Tiefe                       : " + this.tiefe);
        System.out.println("Höhe                        : " + this.hoehe);
        System.out.println("Breite                      : " + this.breite);
        System.out.println("Gewicht                     : " + this.gewicht);
    }
}
