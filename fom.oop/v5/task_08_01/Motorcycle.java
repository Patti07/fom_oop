package fom.oop.v5.task_08_01;

public class Motorcycle extends Vehicle {

    private int funFactor;

    public Motorcycle(String color) {
        super(color);

        System.out.println("Please input fun factor:");
        this.funFactor = Input.getInt();
    }

    @Override
    public void print() {
        super.print();
        System.out.println("FunFactor     : " + this.funFactor);
    }
}
