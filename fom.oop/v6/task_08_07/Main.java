package fom.oop.v6.task_08_07;

public class Main {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse(4);
        Milk milk = new Milk(1.5);
        Bread bread = new Bread(true);

        // This is just a simple example. To make any real sense
        // our of it, we could add one or two additional concrete products.
        warehouse.add(milk);
        warehouse.add(bread);
    }
}
