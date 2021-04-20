package fom.oop.v6.task_09_00_packages.geofigures.circles;

import fom.oop.v6.task_09_00_packages.geofigures.GeometricFigure;

public class Circle extends GeometricFigure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    protected double calcArea() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    protected double calcCircumference() {
        return 2 * Math.PI * this.radius;
    }
}
