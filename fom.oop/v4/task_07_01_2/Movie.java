package fom.oop.v4.task_07_01_2;

public class Movie {

    private String title;

    private String character;

    private int year;

    public Movie(String title, String character, int year) {
        this.setTitle(title);
        this.setCharacter(character);
        this.setYear(year);
    }

    public Movie() {
        this("No title", "No character", 0);
    }

    public Movie(Movie movie) {
        this(movie.getTitle(), movie.getCharacter(), movie.getYear());
    }

    public void print() {
        System.out.println("Movie \"" + this.getTitle() + "\" with characater \"" + this.getCharacter() + "\" published in " + this.getYear());
    }

    public String getMessage() {
        return "Movie \"" + this.getTitle() + "\" with characater \"" + this.getCharacter() + "\" published in " + this.getYear();
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCharacter() {
        return this.character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int jahr) {
        this.year = jahr;
    }
}
