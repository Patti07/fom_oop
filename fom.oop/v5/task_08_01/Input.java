package fom.oop.v5.task_08_01;

import java.io.*;

public class Input {

    public static String getString() {
        String r = "";
        InputStreamReader streamReader = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(streamReader);
        try {
            System.out.println("Your input (String):");
            r = reader.readLine();
        } catch (Exception e) {
            System.out.println("Error. Could not read your input.");
        }
        return r;
    }

    public static int getInt() {
        int r = 0;
        InputStreamReader streamReader = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(streamReader);
        try {
            System.out.println("Your input (integer):");
            String line = reader.readLine();
            r = Integer.parseInt(line);
        } catch (Exception e) {
            System.out.println("Error. Could not read or convert your input.");
        }
        return r;
    }

    public static double getDouble() {
        double r = 0.0;
        InputStreamReader streamReader = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(streamReader);
        try {
            System.out.println("Your input (double):");
            String line = reader.readLine();
            r = Double.parseDouble(line);
        } catch (Exception e) {
            System.out.println("Error. Could not read or convert your input.");
        }
        return r;
    }

}
