package fom.oop.v3.task1_class_methods;

import fom.oop.v1.Car;

public class Main {
    public static void main(String[] args) {
        printCars(createCars());
    }

    /**
     * creates Cars
     * @return Cars array object
     */
    public static Car[] createCars(int CarsCount) {
        if(CarsCount < 5) CarsCount = 5; //if inline notation :)
        Car[] Cars = new Car[CarsCount];
        for(int i = 0; i < Cars.length; i++) {
            Cars[i] = new Car();
            Cars[i].horsePower = (int) Math.round(Math.random() * 200);
            Cars[i].manufacturer = getRandomManufacturer();
            Car.count++;
        }
        return Cars;
    }

    /**
     * calls and overloads createCars method
     * @return result of createCars method
     */
    public static Car[] createCars() {
        return createCars(5);
    }

    /**
     * Prints a Car array
     * @param Cars Car array
     */
    public static void printCars(Car[] Cars) {
        int CarNumber = 1;
        for(Car item: Cars) {
            System.out.println("Car #" + CarNumber + " of manufacturer " + item.manufacturer + " with horse power " + item.horsePower);
            CarNumber++;
        }
        System.out.println("Total number of Cars: " + Car.count);
    }

    /**
     * method from generating manufacturer stuff
     * @return random manufacturers
     */
    public static String getRandomManufacturer() {
        String[] manufacturers = {
                "Toyota",
                "VW",
                "Hyundai",
                "Ford",
                "Renault",
                "Mercedes",
                "Fiat",
                "General Motors",
                "Nissan",
                "BMW",
                "Honda",
                "Peugeot"
        };

        int randomManufacturerIndex = (int) Math.round(Math.random() * (manufacturers.length - 1));
        return manufacturers[randomManufacturerIndex];
    }
}
