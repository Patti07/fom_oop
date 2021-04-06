package fom.oop.v4.task_07_01_2;

public class Main {

    public static void main(String[] args) {
        Movie lordOfTheRings = new Movie("Der Herr der Ringe", "Gandalf", 2001);
        Movie starTrek = new Movie("Star Trek", "Mr. Spock", 1979);
        Movie untitled = new Movie();

        Movie lordOfTheRings2 = new Movie(lordOfTheRings);
        lordOfTheRings2.setTitle(lordOfTheRings2.getTitle() + " - Die zwei Türme");
        lordOfTheRings2.setYear(lordOfTheRings2.getYear() + 1);

        Logger.getInstance().log(lordOfTheRings.getMessage());
        Logger.getInstance().log(starTrek.getMessage());
        Logger.getInstance().log(untitled.getMessage());
        Logger.getInstance().log(lordOfTheRings2.getMessage());
    }
}
