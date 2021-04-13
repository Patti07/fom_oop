package fom.oop.v5.task_08_04;

public class Rectangle extends GeometricFigure {
    private double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    protected double calcArea() {
        return this.length * this.width;
    }

    @Override
    protected double calcCircumference() {
        return 2 * this.length + 2 * this.width;
    }
}
