package fom.oop.v6.task_09_00_packages;

import fom.oop.v6.task_09_00_packages.de.fom.kop.calc.Calculator;
import fom.oop.v6.task_09_00_packages.geofigures.circles.Circle;
import fom.oop.v6.task_09_00_packages.geofigures.Rectangle;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(10, 6);

        circle.print();
        rectangle.print();

        Calculator calculator = new Calculator();
        System.out.println("14 + 5 ist: " + calculator.add(14, 5));
        System.out.println("14.0 + 5.0 ist: " + calculator.add(14.0, 5.0));
        System.out.println("14 + 5.0 ist: " + calculator.add(14, 5.0));
    }
}