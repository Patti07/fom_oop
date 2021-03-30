/**
 * @author Peter Pan <peter.pan@gmail.com>
 * @version 1.0.0
 * @since 2021-03-23
 */

package fom.oop.v1;

public class MyDocuTest {
    public static void main(String[] args) {
        MyDocuTest docu = new MyDocuTest();
        docu.print("Hello");
    }

    // Holds the year of the documentation
    public int year;

    /**
     * Prints a given String to the console
     * @param s
     */
    public void print(String s) {
        this.year = 2;
        System.out.println(this);
        System.out.println(this.year);
        System.out.println("Output: " +s);
    }
}

