package bai_tap.lopcirclevalopcylinder;

public class Run {
    public static void main(String[] args) {
        Circle circle = new Circle(2, "red");
        System.out.println(circle);
        System.out.println("Area of circle is " + circle.getArea());

        Cylinder cylinder = new Cylinder(3, "blue", 4);
        System.out.println(cylinder);
        System.out.println("Volumn of cylinder is " + cylinder.getVolume());
    }
}
