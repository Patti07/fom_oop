package fom.oop.v5.task_08_02;

public class Kreiselpumpe extends Pumpe {

    private int anzahlSchaufeln;
    private int maximaleDrehzahl;

    public Kreiselpumpe(int anzahlSchaufeln, int maximaleDrehzahl) {
        super("Kesselheld", 20, 20, 20, 20, 20, 20);
        this.anzahlSchaufeln = anzahlSchaufeln;
        this.maximaleDrehzahl = maximaleDrehzahl;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Anzahl Schaufeln            : " + this.anzahlSchaufeln);
        System.out.println("Maximale Drehzahl           : " + this.maximaleDrehzahl);
    }
}
