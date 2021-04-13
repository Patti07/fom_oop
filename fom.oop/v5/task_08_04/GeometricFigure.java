package fom.oop.v5.task_08_04;

public abstract class GeometricFigure {

    protected abstract double calcArea();

    protected abstract double calcCircumference();

    public void print() {
        System.out.println("Area: " + this.calcArea());
        System.out.println("Circumference: " + this.calcCircumference());
        System.out.println();
    }
}
