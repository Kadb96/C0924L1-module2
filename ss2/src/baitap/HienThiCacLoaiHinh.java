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
        System.out.println("Input rectangle long");

    }
}

