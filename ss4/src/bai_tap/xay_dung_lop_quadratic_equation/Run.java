package bai_tap.xay_dung_lop_quadratic_equation;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a");
        double a = Double.parseDouble(in.nextLine());
        System.out.println("Enter b");
        double b = Double.parseDouble(in.nextLine());
        System.out.println("Enter c");
        double c = Double.parseDouble(in.nextLine());
        QuadraticEquation solution = new QuadraticEquation();
        solution.setA(a);
        solution.setB(b);
        solution.setC(c);
        double delta = solution.getDiscriminant();
        if (delta > 0) {
            System.out.println("The equation has two roots " + solution.getRoot1() + " and " + solution.getRoot2());
        } else if (delta == 0) {
            System.out.println("The equation has one root " + solution.getRoot1());
        } else {
            System.out.println("The equation has no real roots");
        }
    }
}
