package fom.oop.v5.task_08_02;

public class Auffangbecken extends Produkt {

    private int volumen;

    public Auffangbecken(int volumen) {
        super("Fischteich", 30, 30, 30, 30);
        this.volumen = volumen;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Volumen                     : " + this.volumen);
    }
}
