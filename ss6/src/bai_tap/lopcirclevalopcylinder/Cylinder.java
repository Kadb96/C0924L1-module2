package baitap.lopcirclevalopcylinder;

public class Cylinder extends baitap.lopcirclevalopcylinder.Circle {
    private double height;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return super.getArea() * this.height;
    }

    public String toString() {
        return "Cylinder{" +
                "radius=" + super.getRadius() +
                ", height=" + this.height +
                ", color='" + super.getColor() + '\'' +
                '}';
    }
}
