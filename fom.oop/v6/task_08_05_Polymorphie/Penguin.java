package fom.oop.v6.task_08_05_Polymorphie;

public class Penguin extends Animal {
    private boolean king;

    public Penguin(int weight, String name, boolean king) {
        super(weight, name);
        this.king = king;
    }

    public boolean isKing() {
        return this.king;
    }
}
