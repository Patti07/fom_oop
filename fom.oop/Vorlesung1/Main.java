package fom.oop;

public class Main {
    public static void main(String[] args) {
        Car audi = new Car();
        audi.horsePower = 125;
        audi.manufacturer = "Audi";
        Car.count++;
        System.out.println("Car #" + Car.count + " of manifacturer " + audi.manufacturer + " with " + audi.horsePower + "PS.");

        Car mercedes = new Car();
        mercedes.horsePower = 125;
        mercedes.manufacturer = "Mercedes";
        Car.count++; //count is a static and public variable of class Car. That is why we do not need to access the instance of class car.

        System.out.println("Car #" + Car.count + " of manifacturer " + mercedes.manufacturer + " with " + mercedes.horsePower + "PS.");
        System.out.println("Total number of cars: " + Car.count);
    }
}
