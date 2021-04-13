package fom.oop.v5.task_08_01;

public class Main {

    public static void main(String[] args) {
        System.out.println("Build Car:");
        Car car = new Car("Red");

        System.out.println("Build fom.oop.v5.task_08_01.Motorcycle:");
        Motorcycle motorcycle = new Motorcycle("Green");

        // Call print methods
        car.print();
        motorcycle.print();
    }

}
