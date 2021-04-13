package fom.oop.v5.task_08_01;

public class Car extends Vehicle {

    private String model;

    public Car(String color){
        super(color);

        System.out.println("Please input model:");
        this.model = Input.getString();
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Model         : " + this.model);
    }
}
