package fom.oop.v3.task3_constructors;

public class Main {
    public static void main(String[] args) {
        printCars(createCars());
    }

    /**
     * creates cars
     * @return cars array object
     */
    public static Car[] createCars(int carsCount) {
        if(carsCount < 5) carsCount = 5; //if inline notation :)
        Car[] cars = new Car[carsCount];
        for(int i = 0; i < cars.length; i++) {
            cars[i] = new Car(getRandomManufacturer(), (int) Math.round(Math.random() * 200)); //Use constructors of class Car
            Car.incrementCount();
        }
        return cars;
    }

    /**
     * calls and overloads createCars method
     * @return result of createCars method
     */
    public static Car[] createCars() {
        return createCars(5);
    }

    /**
     * Prints a car array
     * @param cars car array
     */
    public static void printCars(Car[] cars) {
        int carNumber = 1;
        for(Car item: cars) {
            System.out.println("Car #" + carNumber + " of manufacturer " + item.getManufacturer() + " with horse power " + item.getHorsePower());
            carNumber++;
        }
        System.out.println("Total number of cars: " + Car.getCount());
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
