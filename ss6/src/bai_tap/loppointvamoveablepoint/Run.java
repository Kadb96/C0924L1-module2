package bai_tap.loppointvamoveablepoint;

public class Run {
    public static void main(String[] args) {
        bai_tap.loppointvamoveablepoint.Point point = new bai_tap.loppointvamoveablepoint.Point(1,2);
        System.out.println(point);
        System.out.println(point.getX());
        System.out.println(point.getY());
        point.setX(5);
        point.setY(10);
        System.out.println(point);
        point.setXY(3,4);
        System.out.println(point);
        System.out.println(point.getXY()[0]);
        System.out.println(point.getXY()[1]);
        bai_tap.loppointvamoveablepoint.MoveablePoint moveablePoint = new bai_tap.loppointvamoveablepoint.MoveablePoint(1,2,3,4);
        System.out.println(moveablePoint);
        moveablePoint.setX(4);
        moveablePoint.setY(3);
        moveablePoint.setXSpeed(2);
        moveablePoint.setYSpeed(1);
        System.out.println(moveablePoint);
        System.out.println(moveablePoint.getX());
        System.out.println(moveablePoint.getY());
        System.out.println(moveablePoint.getXSpeed());
        System.out.println(moveablePoint.getYSpeed());
        moveablePoint.setSpeed(6,7);
        System.out.println(moveablePoint);
        System.out.println(moveablePoint.getSpeed()[0]);
        System.out.println(moveablePoint.getSpeed()[1]);
        moveablePoint.move();
        System.out.println(moveablePoint);
    }
}
