package baitap.trienkhaiinterfaceresizeablechocaclophinhhoc;

public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(3.5);
        System.out.println(square);

        square = new Square(3.5, "indigo", false);
        System.out.println(square);

        square.resize(1.2);
        System.out.println(square);
        square.howToColor();
    }
}