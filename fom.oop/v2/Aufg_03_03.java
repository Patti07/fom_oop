/**
 * Task 03.01
 * @author Patrick <patrick@gmail.com>
 * @version 1.0.0
 * @since 2021-03-23
 */

package fom.oop.v2;

public class Aufg_03_03 {
    public static void main(String[] args) {
        //First solution
        String[] nameArray = new String[3];
        nameArray[0] = "Patrick";
        nameArray[1] = "Daniel";
        nameArray[2] = "Julian";

        System.out.println(nameArray[0].charAt(0) + ".");
        System.out.println(nameArray[1].length());
        System.out.println(nameArray[2].toUpperCase());
        System.out.println(nameArray[0].concat(" " + nameArray[1]).concat(" " + nameArray[2]).toLowerCase());

        //Second solution
        String[] nameArray2 = {"Jan", "Renato", "Theresa"};
        System.out.println(nameArray2[0].charAt(0) + ".");
        System.out.println(nameArray2[1].length());
        System.out.println(nameArray2[2].toUpperCase());
        System.out.println(nameArray2[0].concat(" " + nameArray2[1]).concat(" " + nameArray2[2]).toLowerCase());
    }

}
