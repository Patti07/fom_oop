package fom.oop.v5.task_08_02;

public class Pumpe extends Produkt {

    private float maximalerBetriebsdruck;
    private int maximaleFoerdermenge;

    public Pumpe(String name, int tiefe, int hoehe, int breite, int gewicht, float maximalerBetriebsdruck, int maximaleFoerdermenge) {
        super(name, tiefe, hoehe, breite, gewicht);
        this.maximalerBetriebsdruck = maximalerBetriebsdruck;
        this.maximaleFoerdermenge = maximaleFoerdermenge;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Maximaler Betriebsdruck     : " + this.maximalerBetriebsdruck);
        System.out.println("Maximale Fördermenge        : " + this.maximaleFoerdermenge);
    }
}
