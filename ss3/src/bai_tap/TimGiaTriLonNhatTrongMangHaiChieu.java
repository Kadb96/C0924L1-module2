package bai_tap;

import java.util.Scanner;

public class TimGiaTriLonNhatTrongMangHaiChieu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("----Input Row----");
        int row = Integer.parseInt(in.nextLine());
        System.out.println("----Input Column----");
        int col = Integer.parseInt(in.nextLine());
        System.out.println("----Input Value----");
        int[][] data = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                data[i][j] = Integer.parseInt(in.nextLine());
            }
        }
        System.out.println("----Data----");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
        int biggest = data[0][0];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (data[i][j] > biggest) {
                    biggest = data[i][j];
                }
            }
        }
        System.out.println("Biggest value is " + biggest);
    }
}
