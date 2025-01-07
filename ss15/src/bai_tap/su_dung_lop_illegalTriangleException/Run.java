package bai_tap.su_dung_lop_illegalTriangleException;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean flag = true;
        float a = 0;
        float b = 0;
        float c = 0;
        while (flag) {
            try {
                System.out.println("Input first side of triangle");
                a = Float.parseFloat(in.nextLine());
                System.out.println("Input second side of triangle");
                b = Float.parseFloat(in.nextLine());
                System.out.println("Input third side of triangle");
                c = Float.parseFloat(in.nextLine());
                isTriangleIsIllegal(a, b, c);
                flag = false;
            } catch (NumberFormatException e) {
                System.out.println("Invalid Input");
            } catch (IllegalTriangleException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("Triangle is successfully created with 3 sides: a = " + a + ", b = " + b + ", c = " + c);
    }

    public static void isTriangleIsIllegal(float a, float b, float c) throws IllegalTriangleException, NumberFormatException {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalTriangleException("All sides must > 0");
        } else if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalTriangleException("Can't make triable with sides: a = " + a + ", b = " + b + ", c = " + c);
        }
    }
}
