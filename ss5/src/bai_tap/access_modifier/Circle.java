package bai_tap.access_modifier;

public class Circle {
    private double radius = 1.0d;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }
}
