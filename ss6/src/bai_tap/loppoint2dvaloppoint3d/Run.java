package baitap.loppoint2dvaloppoint3d;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("-----Test-----");
        System.out.println("Creat a Point2D");
        int x = Integer.parseInt(in.nextLine());
        int y = Integer.parseInt(in.nextLine());
        Point2D point = new Point2D(x, y);
        System.out.println("Test toString");
        System.out.println(point);
        System.out.println("Test getX");
        System.out.println("x = " + point.getX());
        System.out.println("Test getY");
        System.out.println("y = " + point.getY());
        System.out.println("Test setX");
        point.setX(Integer.parseInt(in.nextLine()));
        System.out.println(point);
        System.out.println("Test setY");
        point.setY(Integer.parseInt(in.nextLine()));
        System.out.println(point);
        System.out.println("Test getXY");
        System.out.println("x= " + point.getXY()[0]);
        System.out.println("y= " + point.getXY()[1]);
        System.out.println("Test setXY");
        float[] xy = new float[2];
        xy[0] = Float.parseFloat(in.nextLine());
        xy[1] = Float.parseFloat(in.nextLine());
        point.setXY(xy);
        System.out.println(point);
        System.out.println("Creat a Point3D");
        int x2 = Integer.parseInt(in.nextLine());
        int y2 = Integer.parseInt(in.nextLine());
        int z2 = Integer.parseInt(in.nextLine());
        Point3D point2 = new Point3D(x2, y2, z2);
        System.out.println("Test toString");
        System.out.println(point2);
        System.out.println("Test getX");
        System.out.println("x = " + point2.getX());
        System.out.println("Test getY");
        System.out.println("y = " + point2.getY());
        System.out.println("Test getZ");
        System.out.println("z = " + point2.getZ());
        System.out.println("Test setX");
        point2.setX(Integer.parseInt(in.nextLine()));
        System.out.println(point2);
        System.out.println("Test setY");
        point2.setY(Integer.parseInt(in.nextLine()));
        System.out.println(point2);
        System.out.println("Test setZ");
        point2.setZ(Integer.parseInt(in.nextLine()));
        System.out.println(point2);
        System.out.println("Test getXYZ");
        System.out.println("x= " + point2.getXYZ()[0]);
        System.out.println("y= " + point2.getXYZ()[1]);
        System.out.println("z= " + point2.getXYZ()[2]);
        System.out.println("Test setXYZ");
        float[] xyz = new float[3];
        xyz[0] = Float.parseFloat(in.nextLine());
        xyz[1] = Float.parseFloat(in.nextLine());
        xyz[2] = Float.parseFloat(in.nextLine());
        point2.setXYZ(xyz);
        System.out.println(point2);

    }
}
