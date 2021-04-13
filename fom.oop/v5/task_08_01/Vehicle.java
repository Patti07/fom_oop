package fom.oop.v5.task_08_01;

public class Vehicle {

    private double price;
    private String manufacturer;
    private String color;

    public Vehicle(String color) {
        this.color = color;

        System.out.println("Please input manufacturer:");
        this.manufacturer = Input.getString();

        System.out.println("Please input price:");
        this.price = Input.getDouble();
    }

    public void print() {
        System.out.println();
        System.out.println("Manufacturer  : " + this.manufacturer);
        System.out.println("Price         : " + this.price);
        System.out.println("Color         : " + this.color);
    }
}
