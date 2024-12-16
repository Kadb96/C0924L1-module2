package baitap.trienkhaiinterfaceresizeablechocaclophinhhoc;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(3);
        shapes[1] = new Rectangle(4,2);
        shapes[2] = new Square(5);

        for (Shape shape : shapes) {
            System.out.println(shape);
            System.out.println(shape.getArea());
        }
        for (Shape value : shapes) {
            value.resize(1.3);
        }
        for (Shape shape : shapes) {
            System.out.println(shape);
            System.out.println(shape.getArea());
            if (shape instanceof Square) {
                Square square = (Square) shape;
                square.howToColor();
            }
        }
    }
}
