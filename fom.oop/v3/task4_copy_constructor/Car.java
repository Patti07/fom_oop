package fom.oop.v3.task4_copy_constructor;

public class Car {

    private int horsePower;

    private String manufacturer;

    private static int count = 0;

    public Car(String manufacturer) {
        this.setManufacturer(manufacturer);
    }

    public Car(String manufacturer, int horsePower) {
        this.setManufacturer(manufacturer);
        this.setHorsePower(horsePower);
    }

    public Car(Car car) {
        System.out.println("Copied car.");
        this.setManufacturer(car.getManufacturer());
        this.setHorsePower(car.getHorsePower());
    }

    public int getHorsePower() {
        return this.horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public static int getCount() {
        return count;
    }

    public static void incrementCount() {
        Car.count++;
    }
}
