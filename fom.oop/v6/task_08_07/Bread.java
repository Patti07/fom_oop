package fom.oop.v6.task_08_07;

public class Bread extends Product {
    protected boolean warm;

    public Bread(boolean warm) {
        super("Bread", 1.99);
        this.warm = warm;
    }

}
