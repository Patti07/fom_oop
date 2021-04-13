package fom.oop.v5.task_08_04;

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
