package baitap;

import java.util.Scanner;

public class UngDungChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final float rate = 23000;
        System.out.println("Insert USD");
        float usd = Float.parseFloat(in.nextLine());
        float vnd = usd * rate;
        System.out.println(usd + " USD equal " + vnd + " VND");
    }
}
