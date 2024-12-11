package baitap;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("--Draw Rectangle--");
        System.out.println("Input rectangle long");
        int rectangleLong = Integer.parseInt(scan.nextLine());
        System.out.println("Input rectangle short");
        int rectangleShort = Integer.parseInt(scan.nextLine());
        String draw = "";
        for (int i = 1; i <= rectangleLong; i++) {
            draw = draw + "*";
        }
        for (int i = 1; i <= rectangleShort; i++) {
            System.out.println(draw);
        }
        System.out.println("--Draw Square Triangle--");
        System.out.println("Input square triangle long");
        int squareTriangleLong = Integer.parseInt(scan.nextLine());
        int count1 = squareTriangleLong;
        for (int i = 1; i <= squareTriangleLong; i++) {
            draw = "";
            for (int j = 1; j <= count1; j++) {
                draw = draw + "*";
            }
            System.out.println(draw);
            count1--;
        }
        int count2 = squareTriangleLong;
        for (int i = 1; i <= squareTriangleLong; i++) {
            draw = "";
            for (int j = 1; j <= squareTriangleLong - count2; j++) {
                draw = draw + " ";
            }
            for (int j = 1; j <= count2; j++) {
                draw = draw + "*";
            }
            System.out.println(draw);
            count2--;
        }
        int count3 = squareTriangleLong - 1;
        for (int i = 1; i <= squareTriangleLong; i++) {
            draw = "";
            for (int j = 1; j <= count3; j++) {
                draw = draw + " ";
            }
            for (int j = 1; j <= squareTriangleLong - count3; j++) {
                draw = draw + "*";
            }
            System.out.println(draw);
            count3--;
        }
        int count4 = squareTriangleLong - 1;
        for (int i = 1; i <= squareTriangleLong; i++) {
            draw = "";
            for (int j = 1; j <= squareTriangleLong - count4; j++) {
                draw = draw + "*";
            }
            System.out.println(draw);
            count4--;
        }
        System.out.println("--Draw Isosceles Triangle--");
        System.out.println("Input isosceles triangle base");
        int isoscelesTriangleBase = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < isoscelesTriangleBase; i++) {
            draw = "";
            for (int j = 0; j < i; j++) {
                draw = draw + " ";
            }
            for (int j = 1; j <= isoscelesTriangleBase - i * 2; j++) {
                draw = draw + "*";
            }
            System.out.println(draw);
        }

    }
}

