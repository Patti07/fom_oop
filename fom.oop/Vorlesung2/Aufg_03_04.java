/**
 * Task 03.01
 * @author Patrick <patrick@gmail.com>
 * @version 1.0.0
 * @since 2021-03-23
 */

package fom.oop;

import java.util.Scanner;

public class Aufg_03_04 {
    public static void main(String[] args) {
        while(true) {
            //Read user path input (e.g. C:\Eigene Dateien\Javatest\Beispiel.java)
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a file name path: ");
            try {
                String input = sc.nextLine();

                //get file extension
                String fileExtension = getFileExtension(input);

                //get file name
                String fileName = getFileName(input);

                //get directory
                String directory = getDirectory(input);

                //print output
                printOutput(fileExtension, fileName, directory);
                break;
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("Please enter a valid file path.");
            }
        }
    }

    public static String getFileExtension(String input) {
        return input.substring(input.lastIndexOf(".") + 1);
    }

    public static String getFileName(String input) {
        int index = input.lastIndexOf("\\");

        return input.substring(index + 1, input.lastIndexOf("."));
    }

    public static String getDirectory(String input) {
        return input.substring(0, input.lastIndexOf("\\"));
    }

    public static void printOutput(String fileExtension, String fileName, String directory) {
        System.out.println("Extension:\t\t" + fileExtension + "\nDateiname:\t\t" + fileName + "\nVerzeichnis:\t" + directory);
    }
}
