package fom.oop.v6.task_09_00_packages.geofigures;

public abstract class GeometricFigure {

    protected abstract double calcArea();

    protected abstract double calcCircumference();

    public void print() {
        System.out.println("Area: " + this.calcArea());
        System.out.println("Circumference: " + this.calcCircumference());
        System.out.println();
    }
}
