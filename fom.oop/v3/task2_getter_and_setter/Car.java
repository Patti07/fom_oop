package fom.oop.v3.task2_getter_and_setter;

public class Car {

    private int horsePower;

    private String manufacturer;

    private static int count = 0;

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
