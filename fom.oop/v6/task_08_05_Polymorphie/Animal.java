package fom.oop.v6.task_08_05_Polymorphie;

public class Animal {
    private int weight;
    private String name;

    public Animal(int weight, String name) {
        this.weight = weight;
        this.name = name;
    }

    public int getWeight() {
        return this.weight;
    }

    public String getName() {
        return this.name;
    }
}
