package fom.oop.v6.task_08_05_Polymorphie;

public class Main {

    public static void main(String[] args) {
        Zebra zebra = new Zebra(400, "plains zebra", 20);
        Penguin penguin = new Penguin(23, "emperor penguin", true);

        polymorphPrint(zebra);
        polymorphPrint(penguin);
    }

    public static void polymorphPrint(Animal animal) {
        System.out.println("Name: " + animal.getName());
        System.out.println("Weight: " + animal.getWeight() + " kg");

        if(animal instanceof Zebra) {
            Zebra zebra = (Zebra) animal;
            System.out.println("Stripes: " + zebra.getStripesCount());
        }
        if(animal.getClass().getName().equals("fom.oop.v6.task_08_05_Polymorphie.Penguin")) {
            System.out.println("is King: " + ((Penguin)animal).isKing());
        }

        System.out.println();
    }

}
