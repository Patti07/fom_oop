package fom.oop.v6.task_08_05_Polymorphie;

public class Zebra extends Animal {
    private int stripesCount;

    public Zebra(int weight, String name, int stripesCount) {
        super(weight, name);
        this.stripesCount = stripesCount;
    }

    public int getStripesCount() {
        return this.stripesCount;
    }
}
