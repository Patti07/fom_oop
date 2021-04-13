package fom.oop.v5.task_08_02;

public class Membranpumpe extends Pumpe {

    private String membranmaterial;

    public Membranpumpe(String membranmaterial) {
        super("Star Pump", 10, 10, 10, 10, 10, 10);
        this.membranmaterial = membranmaterial;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Membranmaterial             : " + this.membranmaterial);
    }
}
