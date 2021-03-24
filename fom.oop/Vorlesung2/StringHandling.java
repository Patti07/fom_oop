/**
 * Task 03.01
 * @author Patrick <patrick@gmail.com>
 * @version 1.0.0
 * @since 2021-03-23
 */

package fom.oop;

public class StringHandling {
    public static void main(String[] args) {
        //Generate string buffer objects
        StringBuffer sb1 = new StringBuffer("Super Java!");
        StringBuffer sb2 = new StringBuffer("30");

        //Create reference variable and reference to sb1 object
        StringBuffer sb3;
        sb3 = sb1;

        //Print content of sb3 object
        System.out.println(sb3);

        //Define int variable
        int summe = 20;
        summe += Integer.parseInt(String.valueOf(sb2));
        System.out.println("Summe: " + summe);

        //Extend sb2 object
        sb2.append(" Grad warmes Wasser");
        sb3 = sb2;
        System.out.println(sb3);
    }
}
