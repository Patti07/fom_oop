package fom.oop.v4.task_07_01_1;

public class Main {

    public static void main(String[] args) {
        Movie lordOfTheRings = new Movie("Der Herr der Ringe", "Gandalf", 2001);
        Movie starTrek = new Movie("Star Trek", "Mr. Spock", 1979);
        Movie untitled = new Movie();
        lordOfTheRings.print();
        starTrek.print();
        untitled.print();
    }
}
